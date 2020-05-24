package com.vojinpesalj.microservices.itemdetailsservice.controller;

import com.vojinpesalj.microservices.itemdetailsservice.domain.Item;
import com.vojinpesalj.microservices.itemdetailsservice.domain.ItemResponse;
import java.util.Collections;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @GetMapping
    public ResponseEntity<ItemResponse> getAll() {
        return ResponseEntity.ok(
                ItemResponse.builder()
                        .data(
                                Collections.singletonList(
                                        Item.builder()
                                                .id(0L)
                                                .name("name 0")
                                                .description("description 0")
                                                .build()))
                        .build());
    }
}
