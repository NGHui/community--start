package com.hui.community.service;

import com.hui.community.dto.CommentDTO;
import com.hui.community.enums.NotificationTypeEnum;
import com.hui.community.exception.CommentTypeEnum;
import com.hui.community.model.Comment;
import com.hui.community.model.User;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/14
 */
public interface CommentService {

    /**
     * 添加评论
     * @param comment
     */
    void insert (Comment comment, User commentator);

    /**
     *查询评价类型
     * @param id
     * @param type
     * @return
     */
    List<CommentDTO> listByTargetId(Long id, CommentTypeEnum type);


    void createNotify (Comment comment, Long receiver, String notifierName, String
            outerTitle, NotificationTypeEnum notificationType, Long outerId);
}
