package com.vojinpesalj.microservices.itemratingsservice.controller;

import com.vojinpesalj.microservices.itemratingsservice.domain.ItemRating;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratings")
public class ItemRatingController {

    @GetMapping("/{itemId}")
    public ResponseEntity<ItemRating> getForItem(@PathVariable Long itemId) {
        return ResponseEntity.ok(ItemRating.builder().itemId(0L).rating(4.6).build());
    }
}
