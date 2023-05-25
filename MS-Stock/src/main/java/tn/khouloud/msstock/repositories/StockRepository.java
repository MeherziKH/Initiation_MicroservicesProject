package tn.khouloud.msstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.khouloud.msstock.entites.Stock;

public interface StockRepository extends JpaRepository <Stock, Long>{

}
