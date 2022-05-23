package com.lomari.pectus_.repository.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchCriteria {
  private String key;
  private String operation;
  private Object value;
}
