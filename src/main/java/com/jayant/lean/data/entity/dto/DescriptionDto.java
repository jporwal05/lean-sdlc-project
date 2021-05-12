package com.jayant.lean.data.entity.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "itemType", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = PedDescriptionDto.class, name = "PED"),
    @JsonSubTypes.Type(value = CardDescriptionDto.class, name = "CARD")
})
public class DescriptionDto {
  private String name;
  private ItemType itemType;
}
