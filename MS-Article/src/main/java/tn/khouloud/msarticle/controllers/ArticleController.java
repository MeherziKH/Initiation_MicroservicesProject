package tn.khouloud.msarticle.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.khouloud.dto.ArticleDto;
import tn.khouloud.dto.StockDto;
import tn.khouloud.generique.RestControllerGenerique;
import tn.khouloud.msarticle.entities.Article;
import tn.khouloud.msarticle.services.ArticleService;
import tn.khouloud.msarticle.services.StockClient;

@RestController
@RequiredArgsConstructor
@RequestMapping("article")
public class ArticleController extends RestControllerGenerique<Article, Long> {
    private final ArticleService articleService;
    private final StockClient stockClient;

    @GetMapping(value = "getArticleDTO/{id}")
    public ArticleDto getArticleDTO(@PathVariable(value = "id") long id) {
        return articleService.getArticleDTO(id);
    }

    @GetMapping(value = "stock/{id}")
    public StockDto getStockById(@PathVariable(value = "id") long id) {
        return stockClient.getStockById(id);
    }

}

