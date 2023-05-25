package tn.khouloud.msarticle.services;

import tn.khouloud.dto.ArticleDto;
import tn.khouloud.generique.ServiceGenerique;
import tn.khouloud.msarticle.entities.Article;

public interface ArticleService extends ServiceGenerique<Article, Long> {

    ArticleDto getArticleDTO(long id);
}
