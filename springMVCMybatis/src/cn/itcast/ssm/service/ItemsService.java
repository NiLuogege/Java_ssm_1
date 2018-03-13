package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.ItemCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/**
 * 商品service接口
 * @author niluogege
 *
 */
public interface ItemsService {
	/**
	 * 商品查询列表
	 * @param itemsQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<ItemCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
