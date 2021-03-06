package com.zing.boot.blog.service;


import com.zing.boot.blog.pojo.Comment;

/**
 * Comment 服务接口.
 */
public interface ICommentService {
    /**
     * 根据id获取 Comment
     *
     * @param id
     * @return
     */
    Comment getCommentById(Long id);

    /**
     * 删除评论
     *
     * @param id
     * @return
     */
    void removeComment(Long id);
}
