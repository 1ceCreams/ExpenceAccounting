package com.app.expence.accounting.repositories;

import com.app.expence.accounting.entities.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface GoodRepo extends JpaRepository<Good,Long>{

    @Query(value = "select sum(good_price) from goods where date_of_create=?1",nativeQuery = true )
    double findCostByDateOfCreate(LocalDate date);
}
