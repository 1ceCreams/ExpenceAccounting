package com.app.expence.accounting.repositories;

import com.app.expence.accounting.entities.PuchaseComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PurchaseCompositionRepo extends JpaRepository<PuchaseComposition,Long> {

    @Query(value = "select * from puchase_compositions where id_cheque = ?1",nativeQuery = true)
    List<PuchaseComposition> getPuchaseCompositionByChequeId(Long id);

    @Query(value =
            "select * from puchase_compositions " +
                    "where date_of_purchase between ?1 and ?2 ",nativeQuery = true)
    List<PuchaseComposition> findByDateOfPurchaseBetween(LocalDate start, LocalDate end);
}
