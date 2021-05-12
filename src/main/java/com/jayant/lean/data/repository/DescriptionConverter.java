package com.jayant.lean.data.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayant.lean.data.entity.dto.CardDescriptionDto;
import com.jayant.lean.data.entity.dto.DescriptionDto;
import com.jayant.lean.data.entity.dto.ItemType;
import com.jayant.lean.data.entity.dto.PedDescriptionDto;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
@Converter(autoApply = true)
@Setter
@Getter
public class DescriptionConverter implements AttributeConverter<DescriptionDto, String> {
  @Autowired
  private ObjectMapper objectMapper;


  @Override
  public String convertToDatabaseColumn(DescriptionDto descriptionDto) {
    try {
      return objectMapper.writeValueAsString(descriptionDto);
    } catch (JsonProcessingException ex) {
      log.error("Parsing: " + ex.getMessage());
      return null;
    }
  }

  @Override
  public DescriptionDto convertToEntityAttribute(String json) {
    try {
      JsonNode jsonNode = objectMapper.readTree(json);
      String itemType = jsonNode.get("itemType").textValue();
      if (itemType.equalsIgnoreCase(ItemType.CARD.getItemTypeValue())) {
        return objectMapper.readValue(json, CardDescriptionDto.class);
      } else {
        return objectMapper.readValue(json, PedDescriptionDto.class);
      }
    } catch (JsonProcessingException ex) {
      log.error("Parsing" + ex.getMessage());
      return null;
    }
  }
}
