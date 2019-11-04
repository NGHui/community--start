package com.hui.community.service;

import com.hui.community.dto.NotificationDTO;
import com.hui.community.dto.PaginationDTO;
import com.hui.community.model.User;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/21
 */
public interface NotificationService {

    PaginationDTO list(Long userId, Integer page, Integer size);

    Long unreadCount(Long userId);

    NotificationDTO read(Long id, User user);
}
