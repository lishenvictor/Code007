package com.news.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.news.entity.Comment;

/**
 * 评论Repository接口
 * @author Administrator
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Integer>,JpaSpecificationExecutor<Comment> {

	/**
	 * 删除指定帖子的所有评论
	 * @param articleId
	 */
	@Query(value="delete from t_comment where article_id=?1",nativeQuery=true)
	@Modifying
	public void deleteByArticleId(Integer articleId);
	
}
