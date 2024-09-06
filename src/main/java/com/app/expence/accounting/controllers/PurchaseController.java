package com.app.expence.accounting.controllers;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.repositories.PurchaseCompositionRepo;
import com.app.expence.accounting.services.PurchaseCompositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
