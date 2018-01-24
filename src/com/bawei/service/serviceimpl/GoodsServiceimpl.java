package com.bawei.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.GoodsDao;
import com.bawei.dto.Goods;
import com.bawei.dto.Pai;
import com.bawei.service.GoodsService;

@Service
public class GoodsServiceimpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public List<Pai> pai() {
		// TODO Auto-generated method stub
		return goodsDao.pai();
	}

	@Override
	public List<Goods> list(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.list(goods);
	}

	@Override
	public List<Pai> bra(Pai pai) {
		// TODO Auto-generated method stub
		return  goodsDao.bra(pai);
	}

}
