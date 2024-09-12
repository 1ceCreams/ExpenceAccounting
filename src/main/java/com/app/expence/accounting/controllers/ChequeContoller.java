package com.app.expence.accounting.controllers;

import com.app.expence.accounting.services.ChequeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChequeContoller {
    private final ChequeService chequeService;

}
