package com.app.expence.accounting.services;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.entities.Good;
import com.app.expence.accounting.repositories.GoodRepo;
import com.app.expence.accounting.utils.GoodMappingUtils;
import jdk.jshell.Snippet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoodService {

    private final GoodRepo goodRepo;
    private final GoodMappingUtils goodMappingUtils;

    public void addGood(GoodDto goodDto){
        Good newGood = goodMappingUtils.mapToGood(goodDto);
        newGood.setDateOfCreate(LocalDate.now());
        goodRepo.save(newGood);
    }

    public List<Good> getGoods(){
        return goodRepo.findAll();
    }

    public Good getGood(Long id) {
        return goodRepo.findById(id).orElse(null);
    }

}
