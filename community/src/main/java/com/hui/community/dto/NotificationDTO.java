package com.hui.community.dto;

import lombok.Data;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/21
 */
@Data
public class NotificationDTO {

    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
