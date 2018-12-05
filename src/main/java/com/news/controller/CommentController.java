package com.news.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.news.entity.Comment;
import com.news.service.CommentService;

/**
 * 评论控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/comment")
public class CommentController {

	@Resource
	private CommentService commentService;
	
	/**
	 * 分页查询某个帖子的评论信息
	 * @param s_comment
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/list")
	public List<Comment> list(Comment s_comment,@RequestParam(value="page",required=false)Integer page){
		s_comment.setState(1); // 只显示审核通过
		return commentService.list(s_comment, page, 6, Direction.DESC, "commentDate");
	}
	
}
