package com.app.expence.accounting.repositories;

import com.app.expence.accounting.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeRepo extends JpaRepository<Cheque,Long> {

}