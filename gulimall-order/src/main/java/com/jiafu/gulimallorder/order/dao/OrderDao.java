package com.jiafu.gulimallorder.order.dao;

import com.jiafu.gulimallorder.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 09:27:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
