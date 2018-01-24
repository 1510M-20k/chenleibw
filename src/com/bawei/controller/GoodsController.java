package com.bawei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.dto.Goods;
import com.bawei.dto.Pai;
import com.bawei.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/list.action")
	public String list(HttpServletRequest request,Goods goods,Pai pai) {
		List<Pai> pa = goodsService.pai();
		request.setAttribute("pa", pa);
		List <Goods> list = goodsService.list(goods);
		List <Pai> pai1 = goodsService.bra(pai);
		request.setAttribute("list", list);
		request.setAttribute("pai1", pai1);
		request.setAttribute("pai", pai);
		request.setAttribute("goods", goods);
		return "goods";
	}

}
