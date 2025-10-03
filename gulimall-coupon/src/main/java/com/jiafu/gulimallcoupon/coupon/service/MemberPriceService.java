package com.jiafu.gulimallcoupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.gulimallcoupon.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-22 23:21:41
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

