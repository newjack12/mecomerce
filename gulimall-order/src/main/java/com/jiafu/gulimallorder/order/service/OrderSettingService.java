package com.jiafu.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.gulimallorder.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 09:27:35
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

