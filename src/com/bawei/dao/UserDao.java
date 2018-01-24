package com.bawei.dao;

import java.util.List;

import com.bawei.dto.Goods;
import com.bawei.dto.Pai;

public interface UserDao {

	List<Goods> list(Goods goods);

	List<Pai> pai(Pai pai);

}
