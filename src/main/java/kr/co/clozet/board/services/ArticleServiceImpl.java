package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Article2;
import kr.co.clozet.board.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName:kr.co.clozet.board.services
 * fileName        :ArticleServiceImpl.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repository;

    @Override
    public List<Article2> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Article2> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Article2> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Article2 article) {
        repository.delete(article);
        return "";
    }

    @Override
    public String save(Article2 article) {
        repository.save(article);
        return "";
    }


}
