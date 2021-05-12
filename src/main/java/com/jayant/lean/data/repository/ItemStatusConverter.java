package com.jayant.lean.data.repository;

import java.util.stream.Stream;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ItemStatusConverter implements AttributeConverter<ItemStatus, String> {

  @Override
  public String convertToDatabaseColumn(ItemStatus itemStatus) {
    if (itemStatus == null) {
      return null;
    }
    return itemStatus.getItemStatusValue();
  }

  @Override
  public ItemStatus convertToEntityAttribute(String itemStatusValue) {
    if (itemStatusValue == null) {
      return null;
    }
    return Stream.of(ItemStatus.values())
        .filter(itemStatus -> itemStatus.getItemStatusValue().equals(itemStatusValue)).findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
