package com.jayant.lean.data.entity.dto;

public enum ItemType {
  CARD("card"), PED("ped");

  private String itemTypeValue;

  ItemType(String itemTypeValue) {
    this.itemTypeValue = itemTypeValue;
  }

  public String getItemTypeValue() {
    return this.itemTypeValue;
  }
}
