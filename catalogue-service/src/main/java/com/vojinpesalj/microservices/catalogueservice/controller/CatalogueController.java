package com.vojinpesalj.microservices.catalogueservice.controller;

import com.vojinpesalj.microservices.catalogueservice.domain.ItemRating;
import com.vojinpesalj.microservices.catalogueservice.domain.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/catalogue")
public class CatalogueController {

    @Autowired private WebClient.Builder webClientBuilder;

    @GetMapping
    public ResponseEntity<ItemResponse> get() {
        ItemResponse itemResponse =
                webClientBuilder
                        .build()
                        .get()
                        .uri("http://item-details-service/api/items")
                        .retrieve()
                        .bodyToMono(ItemResponse.class)
                        .block();

        itemResponse
                .getData()
                .forEach(
                        item ->
                                item.setRating(
                                        webClientBuilder
                                                .build()
                                                .get()
                                                .uri(
                                                        "http://item-ratings-service/api/ratings/"
                                                                + item.getId())
                                                .retrieve()
                                                .bodyToMono(ItemRating.class)
                                                .block()
                                                .getRating()));

        System.out.println("test");

        return ResponseEntity.ok(itemResponse);
    }
}
