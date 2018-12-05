package com.news.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.news.entity.Article;

/**
 * 资源Repository接口
 * @author Administrator
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>,JpaSpecificationExecutor<Article> {

}
