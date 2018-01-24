package com.bawei.service;

import java.util.List;

import com.bawei.dto.Goods;
import com.bawei.dto.Pai;

public interface GoodsService {

	List<Pai> pai();

	List<Goods> list(Goods goods);

	List<Pai> bra(Pai pai);

}
