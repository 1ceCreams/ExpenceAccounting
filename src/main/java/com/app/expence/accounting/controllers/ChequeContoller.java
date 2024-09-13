package com.app.expence.accounting.controllers;

import com.app.expence.accounting.services.ChequeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.client.RestTemplate;


@RestController
@RequiredArgsConstructor
public class ChequeContoller {
    private final ChequeService chequeService;

}
