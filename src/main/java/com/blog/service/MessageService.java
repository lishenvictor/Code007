package com.blog.service;

import java.util.List;

import com.blog.entity.Message;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

/**
 * 用户消息Service接口
 * @author Administrator
 *
 */
@Service("messageService")
public interface MessageService {

	/**
	 * 根据条件分页查询消息信息
	 * @param s_resource
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Message> list(Message s_message, Integer page, Integer pageSize, Direction direction, String... properties);
	
	/**
	 * 根据条件获取总记录数
	 * @param s_message
	 * @return
	 */
	public Long getCount(Message s_message);
	
	/**
	 * 添加或者修改用户消息
	 * @param message
	 */
	public void save(Message message);
	
	/**
	 * 查询某个用户下的所有消息
	 * @param userId
	 * @return
	 */
	public Integer getCountByUserId(Integer userId);
	
	/**
	 * 修改成已经查看状态
	 * @param userId
	 */
	public void updateState(Integer userId);
}
