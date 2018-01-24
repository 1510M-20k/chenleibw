package com.bawei.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.UserDao;
import com.bawei.dto.Goods;
import com.bawei.dto.Pai;
import com.bawei.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<Goods> list(Goods goods) {
		// TODO Auto-generated method stub
		return userDao.list(goods);
	}

	@Override
	public List<Pai> pai(Pai pai) {
		// TODO Auto-generated method stub
		return userDao.pai(pai);
	}

}
