package com.vojinpesalj.microservices.itemratingsservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRating {
    private Long itemId;
    private Double rating;
}
