package tn.khouloud.dto;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ArticleDto {
    private String name;
    private int qte;
    private StockDto stock;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}

