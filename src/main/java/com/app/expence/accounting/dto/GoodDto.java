package com.app.expence.accounting.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GoodDto {
    String title;
    double price;
    int amount;
    LocalDate dateOfPurchase;
}
