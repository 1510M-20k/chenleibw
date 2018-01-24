package com.bawei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.dto.Goods;
import com.bawei.dto.Pai;
import com.bawei.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list.action")
	private String list(HttpServletRequest request,Goods goods,Pai pai) {
			Integer pid = goods.getPid();
			List <Goods> list = userService.list(goods);
			List <Pai> pai1 = userService.pai(pai);
			request.setAttribute("list", list);
			request.setAttribute("pai1", pai1);
		return "list";
	}
}
