package com.app.expence.accounting.services;

import com.app.expence.accounting.dto.GoodDto;
import com.app.expence.accounting.entities.Cheque;
import com.app.expence.accounting.entities.Good;
import com.app.expence.accounting.entities.PuchaseComposition;
import com.app.expence.accounting.repositories.ChequeRepo;
import com.app.expence.accounting.repositories.GoodRepo;
import com.app.expence.accounting.repositories.PurchaseCompositionRepo;
import com.app.expence.accounting.utils.GoodMappingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
@RequiredArgsConstructor
public class PurchaseCompositionService {

    private final GoodRepo goodRepo;
    private final ChequeRepo chequeRepo;
    private final PurchaseCompositionRepo purchaseCompositionRepo;
    private final GoodMappingUtils goodMappingUtils;
    public void addPurchaseComposition(List<GoodDto> goodDtoSet){
        Cheque cheque = new Cheque();
        cheque.setDateOfPurchase(LocalDate.now());
        chequeRepo.save(cheque);
        goodDtoSet.forEach(element ->
                {
                    PuchaseComposition pc = new PuchaseComposition();
                    Good good = goodMappingUtils.mapToGood(element);
                    good.setDateOfCreate(LocalDate.now());
                    goodRepo.save(good);
                    pc.setGood(good);
                    pc.setCheque(cheque);
                    pc.setDateOfPurchase(element.getDateOfPurchase());
                    pc.setAmount(element.getAmount());
                    purchaseCompositionRepo.save(pc);
                }
                );
    };

    public List<PuchaseComposition> getCompositionByChequeId(Long id){
        return purchaseCompositionRepo.getPuchaseCompositionByChequeId(id);
    }

    public double getExpenceForPeriod(LocalDate start, LocalDate end){
        double sum = purchaseCompositionRepo.findByDateOfPurchaseBetween(start,end)
                .stream()
                .mapToDouble(element -> element.getAmount()*element.getGood().getPrice()).sum();
        return sum;
    }
}
