package com.app.expence.accounting.utils;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.entities.Good;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class GoodMappingUtils {

    public GoodDto mapToGoodDto(Good good, int amount, LocalDate dateOfPurchase){
        GoodDto goodDto = new GoodDto();
        goodDto.setTitle(good.getTitle());
        goodDto.setPrice(good.getPrice());
        goodDto.setAmount(amount);
        goodDto.setDateOfPurchase(dateOfPurchase);
        return goodDto;
    }

    public GoodDto maptoGoodDto(Good good){
        GoodDto goodDto = new GoodDto();
        goodDto.setTitle(good.getTitle());
        goodDto.setPrice(good.getPrice());
        return goodDto;
    }

    public Good mapToGood(GoodDto goodDto){
        Good good = new Good();
        good.setTitle(goodDto.getTitle());
        good.setPrice(goodDto.getPrice());
        return good;
    }
}
