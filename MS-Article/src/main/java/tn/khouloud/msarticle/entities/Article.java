package tn.khouloud.msarticle.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import tn.khouloud.entities.BaseEntity;

import javax.persistence.Entity;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article extends BaseEntity {
    private String name;
    private int qte;
    private long idStock;
}
