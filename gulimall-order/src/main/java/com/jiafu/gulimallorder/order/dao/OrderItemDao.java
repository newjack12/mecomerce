package com.jiafu.gulimallorder.order.dao;

import com.jiafu.gulimallorder.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 09:27:35
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
