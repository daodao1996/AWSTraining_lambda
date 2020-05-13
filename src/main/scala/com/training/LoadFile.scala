package com.training

class LoadFile extends S3{
  def load() : String = getFile("aws-training-dingyunpeng", "readme.txt")
}
