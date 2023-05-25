package tn.khouloud.msarticle.mappers;

import tn.khouloud.dto.ArticleDto;
import tn.khouloud.dto.StockDto;
import tn.khouloud.msarticle.entities.Article;

public class ArticleMapper {
    public static ArticleDto mapToDto(Article article, StockDto stockDto){
        ArticleDto articleDto = ArticleDto.builder()
                .name(article.getName())
                .qte(article.getQte())
                .stock(stockDto)
                .build();
        return articleDto;
    }

    public static Article mapToEntity(ArticleDto articletDto){
        Article article = Article.builder()
                .name(articletDto.getName())
                .qte(articletDto.getQte())
                .idStock(articletDto.getStock().getId())
                .build();
        return article;
    }
}
