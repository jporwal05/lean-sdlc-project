package com.jayant.lean.data.repository;

public enum ItemStatus {
  ACTIVE("active"), INACTIVE("inactive");

  private String itemStatusValue;

  ItemStatus(String itemStatusValue) {
    this.itemStatusValue = itemStatusValue;
  }

  public String getItemStatusValue() {
    return this.itemStatusValue;
  }
}
