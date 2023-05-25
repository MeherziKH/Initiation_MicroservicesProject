package tn.khouloud.msarticle.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.khouloud.dto.ArticleDto;
import tn.khouloud.generique.ServiceGeneriqueImp;
import tn.khouloud.msarticle.entities.Article;
import tn.khouloud.msarticle.mappers.ArticleMapper;
import tn.khouloud.msarticle.repositories.ArticleRepository;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ArticleServiceImp extends ServiceGeneriqueImp<Article, Long> implements ArticleService {
    private final ArticleRepository articleRepo;
    private final StockClient stockClient;

    @Override
    public Article add(Article entity) {
        entity.setCreatedAt(LocalDate.now());
        return articleRepo.save(entity);
    }

    /*@Override
    public Article update(Article entity) {
        entity.setUpdatedAt(LocalDate.now());
        return articleRepo.save(entity);
    }*/

    @Override
    public ArticleDto getArticleDTO(long id) {

        Article article = articleRepo.findById(id).orElse(null);
        Assert.notNull(article,"no article found with this id ");

        return ArticleMapper.mapToDto(article,stockClient.getStockById(article.getIdStock()));
    }
}
