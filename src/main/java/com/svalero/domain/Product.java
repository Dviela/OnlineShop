package com.svalero.domain;
import lombok.*;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@ToString

public class Product {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private int price;

    private String image;
}
