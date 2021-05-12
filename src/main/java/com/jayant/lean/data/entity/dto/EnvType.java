package com.jayant.lean.data.entity.dto;

public enum EnvType {
  TEST("test"), PROD("prod");

  private String envTypeValue;

  EnvType(String envTypeValue) {
    this.envTypeValue = envTypeValue;
  }

  public String getEnvTypeValue() {
    return this.envTypeValue;
  }
}
