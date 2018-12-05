package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.entity.Link;

/**
 * 友情链接Repository接口
 * @author Administrator
 *
 */
public interface LinkRepository extends JpaRepository<Link, Integer>{

}
