package com.vojinpesalj.microservices.itemdetailsservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
  private Long id;
  private String name;
  private String description;
}
