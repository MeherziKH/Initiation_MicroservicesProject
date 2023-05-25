package tn.khouloud.msarticle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.khouloud.msarticle.entities.Article;

public interface ArticleRepository extends JpaRepository <Article, Long>{

}
