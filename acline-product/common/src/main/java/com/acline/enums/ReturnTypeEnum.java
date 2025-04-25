package com.acline.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReturnTypeEnum  {

	AUTO(0),
	EXCEL(1),
	JSON(2);

	private final Integer value;

}
