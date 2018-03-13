package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ItemCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/**
 * 商品自定义mapper
 * 
 * @author niluogege
 *
 */
public interface ItemMapperCustom {
	/**
	 * 商品查询列表
	 * @param itemsQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<ItemCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
