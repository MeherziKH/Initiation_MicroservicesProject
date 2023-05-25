package tn.khouloud.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StockDto {
    private long id;
    private String zone;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
