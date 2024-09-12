package com.app.expence.accounting.repositories;

import com.app.expence.accounting.entities.PuchaseComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseCompositionRepo extends JpaRepository<PuchaseComposition,Long> {

    @Query(value = "select * from puchase_compositions where id_cheque = ?1",nativeQuery = true)
    List<PuchaseComposition> getPuchaseCompositionByChequeId(Long id);
}
