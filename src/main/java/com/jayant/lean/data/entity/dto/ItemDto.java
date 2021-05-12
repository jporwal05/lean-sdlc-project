package com.jayant.lean.data.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.jayant.lean.data.repository.ItemStatus;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ItemDto {
  private Long id;
  private String name;
  private DescriptionDto description;
  private ItemStatus itemStatus;
  @JsonProperty(access = Access.READ_ONLY)
  private LocalDateTime createdAt;
  @JsonProperty(access = Access.READ_ONLY)
  private LocalDateTime updatedAt;
}
