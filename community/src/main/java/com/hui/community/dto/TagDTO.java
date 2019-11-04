package com.hui.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/19
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}