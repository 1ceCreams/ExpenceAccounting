package com.app.expence.accounting.repositories;

import com.app.expence.accounting.entities.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface GoodRepo extends JpaRepository<Good,Long>{

}
