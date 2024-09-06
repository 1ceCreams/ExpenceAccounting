package com.app.expence.accounting.services;

import com.app.expence.accounting.entities.Good;
import com.app.expence.accounting.repositories.ChequeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ChequeService {

    private final ChequeRepo chequeRepo;

}
