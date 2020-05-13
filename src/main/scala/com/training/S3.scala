package com.training

import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.model.{CopyObjectRequest, CopyObjectResult}

trait S3 {
  private val s3 = AmazonS3ClientBuilder.defaultClient

  def getFile(bucketName: String, path: String): String = s3.getObjectAsString(bucketName, path)

  def copyFile(sourceBucketName: String, sourceKey: String, destinationBucketName: String, destinationKey: String): CopyObjectResult =
    s3.copyObject(new CopyObjectRequest(sourceBucketName, sourceKey, destinationBucketName, destinationKey))
}
