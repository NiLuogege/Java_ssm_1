package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.ItemMapperCustom;
import cn.itcast.ssm.po.ItemCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemMapperCustom itemMapperCustom;

	@Override
	public List<ItemCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		return itemMapperCustom.findItemsList(itemsQueryVo);
	}
}
