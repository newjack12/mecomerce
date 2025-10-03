package com.jiafu.gulimallcoupon.coupon.dao;

import com.jiafu.gulimallcoupon.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-22 23:21:41
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
