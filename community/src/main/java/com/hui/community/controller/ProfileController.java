package com.hui.community.controller;

import com.hui.community.dto.PaginationDTO;
import com.hui.community.mapper.UserMapper;
import com.hui.community.model.User;
import com.hui.community.service.NotificationService;
import com.hui.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by codedrinker on 2019/5/15.
 */
@Controller
public class ProfileController {
    @Autowired
    private QuestionService questionServiceImpl;

    @Autowired
    private NotificationService notificationServiceImpl;

    @GetMapping("/profile/{action}")
    public String profile(HttpServletRequest request,
                          @PathVariable(name = "action") String action,
                          Model model,
                          @RequestParam(name = "page", defaultValue = "1") Integer page,
                          @RequestParam(name = "size", defaultValue = "5") Integer size) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }
        if ("questions".equals(action)) {
            model.addAttribute("section", "questions");
            model.addAttribute("sectionName", "我的提问");
            PaginationDTO paginationDTO = questionServiceImpl

                    .list(user.getId(), page, size);
            model.addAttribute("pagination", paginationDTO);
        } else if ("replies".equals(action)) {
            PaginationDTO paginationDTO = notificationServiceImpl.list(user.getId(), page, size);
            //Long unreadCount = notificationServiceImpl.unreadCount(user.getId());
            model.addAttribute("section", "replies");
            model.addAttribute("pagination", paginationDTO);
            //model.addAttribute("unreadCount", unreadCount);
            model.addAttribute("sectionName", "最新回复");
        }
        return "profile";
    }
}