package com.zing.boot.blog.service;

import java.util.List;

import com.zing.boot.blog.pojo.EsBlog;
import com.zing.boot.blog.pojo.User;
import com.zing.boot.blog.vo.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Blog 服务接口.
 */
public interface IEsBlogService {
 	
	/**
	 * 删除Blog
	 * @param id
	 * @return
	 */
	void removeEsBlog(String id);
	
	/**
	 * 更新 EsBlog
	 * @param esBlog
	 * @return
	 */
	EsBlog updateEsBlog(EsBlog esBlog);
	
	/**
	 * 根据id获取Blog
	 * @param blogId
	 * @return
	 */
	EsBlog getEsBlogByBlogId(Long blogId);
 
	/**
	 * 最新博客列表，分页
	 * @param keyword
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listNewestEsBlogs(String keyword, Pageable pageable);
 
	/**
	 * 最热博客列表，分页
	 * @param keyword
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listHotestEsBlogs(String keyword, Pageable pageable);
	
	/**
	 * 博客列表，分页
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listEsBlogs(Pageable pageable);
	/**
	 * 最新前5
	 * @return
	 */
	List<EsBlog> listTop5NewestEsBlogs();
	
	/**
	 * 最热前5
	 * @return
	 */
	List<EsBlog> listTop5HotestEsBlogs();
	
	/**
	 * 最热前 30 标签
	 * @return
	 */
	List<TagVO> listTop30Tags();

	/**
	 * 最热前12用户
	 * @return
	 */
	List<User> listTop12Users();
}
