package com.blog.repository;


import com.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 资源Repository接口
 * @author Administrator
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>,JpaSpecificationExecutor<Article> {

}
