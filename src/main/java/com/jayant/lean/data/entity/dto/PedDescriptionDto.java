package com.jayant.lean.data.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PedDescriptionDto extends DescriptionDto {
  private String firmwareVersion;
  private EnvType envType;
}
