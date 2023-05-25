package tn.khouloud.msstock.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.khouloud.generique.ServiceGeneriqueImp;
import tn.khouloud.msstock.entites.Stock;
import tn.khouloud.msstock.repositories.StockRepository;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class StockServiceImp  extends ServiceGeneriqueImp<Stock, Long> implements StockService {

    private final StockRepository stockRepo;
    @Override
    public Stock add(Stock entity) {
        entity.setCreatedAt(LocalDate.now());
        return stockRepo.save(entity);
    }



}
