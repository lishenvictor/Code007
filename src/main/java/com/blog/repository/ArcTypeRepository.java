package com.blog.repository;

import com.blog.entity.ArcType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 资源类别Repository接口
 * @author Administrator
 *
 */
public interface ArcTypeRepository extends JpaRepository<ArcType, Integer>,JpaSpecificationExecutor<ArcType> {

}
