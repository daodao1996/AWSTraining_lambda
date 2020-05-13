package com.training

import com.amazonaws.services.s3.model.CopyObjectResult

class CopyFile extends S3{
    def copy: CopyObjectResult =
      copyFile("aws-training-dingyunpeng", "readme.txt", "copy-bucket-dyp", "copyReadme.txt")
}
