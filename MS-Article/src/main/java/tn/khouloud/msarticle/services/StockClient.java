package tn.khouloud.msarticle.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.khouloud.dto.StockDto;

@FeignClient(name = "ms-stock")
public interface StockClient {
     @GetMapping(value = "stock/{id}")
     StockDto getStockById(@PathVariable(value = "id") Long id);
}








