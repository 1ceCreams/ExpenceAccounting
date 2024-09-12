package com.app.expence.accounting.controllers;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.repositories.PurchaseCompositionRepo;
import com.app.expence.accounting.services.PurchaseCompositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseCompositionService purchaseCompositionService;

    @PostMapping("/addPurchase")
    public void addPurchase (@RequestBody List<GoodDto> goodDtos){

        purchaseCompositionService.addPurchaseComposition(goodDtos);
    }

    @GetMapping("/getExpenceByPeriod/{start}&{end}")
    public double getExpenceByPeriod(@PathVariable LocalDate start, @PathVariable LocalDate end){
        return purchaseCompositionService.getExpenceForPeriod(start,end);
    }

}
