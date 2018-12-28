package com.blog.repository;

import com.blog.entity.UserDownload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * 用户下载资源Repository接口
 * @author Administrator
 *
 */
public interface UserDownloadRepository extends JpaRepository<UserDownload, Integer>,JpaSpecificationExecutor<UserDownload>{

	/**
	 * 查询某个用户下载某个资源的次数
	 * @param userId
	 * @return
	 */
	@Query(value="select count(*) from t_user_download where user_id=?1 and article_id=?2 ",nativeQuery=true)
	public Integer getCountByUserIdAndArticleId(Integer userId,Integer articleId);
	
}
