package tn.khouloud.msstock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.khouloud.generique.RestControllerGenerique;
import tn.khouloud.msstock.entites.Stock;
import tn.khouloud.msstock.services.StockService;

@RestController
@RequiredArgsConstructor
@RequestMapping("stock")
public class StockController extends RestControllerGenerique<Stock, Long> {
    private final StockService stockService;

}

