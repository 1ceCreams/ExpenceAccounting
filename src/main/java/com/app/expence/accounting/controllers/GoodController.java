package com.app.expence.accounting.controllers;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.entities.Good;
import com.app.expence.accounting.entities.PuchaseComposition;
import com.app.expence.accounting.services.GoodService;
import com.app.expence.accounting.services.PurchaseCompositionService;
import com.app.expence.accounting.utils.GoodMappingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class GoodController {
    private final  GoodService goodService;
    private final PurchaseCompositionService purchaseCompositionService;
    private final GoodMappingUtils goodMappingUtils;

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

    @GetMapping("/getGoodByCheque/{id}")
    public List<GoodDto> getGoodByCheque(@PathVariable Long id){
        return goodService.getGoodsByCheque(id);

    }
}
