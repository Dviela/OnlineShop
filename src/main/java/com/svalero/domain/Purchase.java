package com.svalero.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Purchase {
    private int id;
    @NonNull
    private LocalDate date;
}
