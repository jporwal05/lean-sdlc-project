package com.jayant.lean.data.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CardDescriptionDto extends DescriptionDto {
  private EnvType envType;
}
