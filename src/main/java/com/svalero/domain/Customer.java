package com.svalero.domain;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@ToString

public class Customer {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    private String email;
}
