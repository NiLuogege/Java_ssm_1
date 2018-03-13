package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.ItemCustom;
import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.service.ItemsService;


/**
 * 商品管理
 * @author niluogege
 *
 */
@Controller
public class ItemController {
	
	//注入service
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		List<ItemCustom> itemsList = itemsService.findItemsList(null);
		
//		// 使用静态数据将商品信息列表显示在jsp页面
//		// 商品列表
//		List<Items> itemsList = new ArrayList<Items>();
//
//		Items items_1 = new Items();
//		items_1.setName("lalal笔记本");
//		items_1.setPrice(6000f);
//		items_1.setCreatetime(new Date());
//		items_1.setDetail("fafafa！");
//
//		Items items_2 = new Items();
//		items_2.setName("苹果手机");
//		items_2.setPrice(5000f);
//		items_2.setDetail("iphone6苹果手机！");
//
//		itemsList.add(items_1);
//		itemsList.add(items_2);

		ModelAndView mav = new ModelAndView();
		//填充数据到request
		mav.addObject("itemsList", itemsList);
		//指定转发的jsp
		mav.setViewName("itemsList");
		return mav;

	}
}
