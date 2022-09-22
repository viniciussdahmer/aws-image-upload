package com.viniciussteindahmer.awsimageupload.bucket;

public enum BucketName {

  PROFILE_IMAGE("viniciussteindahmer-image-upload");

  private final String buckerName;


  BucketName(String buckerName) {
    this.buckerName = buckerName;
  }

  public String getBuckerName() {
    return buckerName;
  }
}
