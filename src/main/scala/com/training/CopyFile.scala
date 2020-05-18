package com.training

class CopyFile extends S3{
    def copy: String = {
      println("copy start")
      copyFile("aws-training-dingyunpeng", "readme.txt", "copy-bucket-dyp", "copyReadme.txt")
      println("copy finished")
      "success"
  }
}
