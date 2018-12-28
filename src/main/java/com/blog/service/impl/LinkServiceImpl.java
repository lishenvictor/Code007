package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.blog.service.LinkService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.blog.entity.Link;
import com.blog.repository.LinkRepository;

/**
 * 友情链接Service实现类
 * @author Administrator
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {

	@Resource
	private LinkRepository linkRepository;
	
	@Override
	public List<Link> list(Integer page,Integer pageSize,Direction direction, String... properties) {
		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
		return linkRepository.findAll(pageable).getContent();
	}

	@Override
	public Long getCount() {
		return linkRepository.count();
	}

	@Override
	public void save(Link link) {
		linkRepository.save(link);
	}

	@Override
	public void delete(Integer id) {
		linkRepository.delete(id);
	}

	@Override
	public List<Link> listAll(Direction direction, String... properties) {
		Sort sort=new Sort(direction, properties);
		return linkRepository.findAll(sort);
	}

	@Override
	public Link getById(Integer id) {
		return linkRepository.findOne(id);
	}
	

	
}
