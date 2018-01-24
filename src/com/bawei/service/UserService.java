package com.bawei.service;

import java.util.List;

import com.bawei.dto.Goods;
import com.bawei.dto.Pai;

public interface UserService {

	List<Goods> list(Goods goods);

	List<Pai> pai(Pai pai);

}
