package com.yj.web1127.controller;

import com.yj.web1127.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/list.do")
    public String index(Model model){
        List<User> list =  new ArrayList<User>();
        User user1=new User();
        User user2= new User();
        user1.setId(1);
        user2.setId(2);
        user1.setName("aaaa");
        user2.setName("nnnn");

        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        return "index";
    }

}
