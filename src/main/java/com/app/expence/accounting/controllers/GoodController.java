package com.app.expence.accounting.controllers;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.entities.Good;
import com.app.expence.accounting.services.GoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class GoodController {
    private final  GoodService goodService;

    @PostMapping("/addGood")
    public void addGood(@RequestBody GoodDto goodDto){

        goodService.addGood(goodDto);
    }

    @GetMapping("/getGoods")
    public List<Good> getGood(){
        return goodService.getGoods();
    }
    @GetMapping("/getGood/{id}")
    public Good getGood(@PathVariable Long id){
        return goodService.getGood(id);
    }


}
