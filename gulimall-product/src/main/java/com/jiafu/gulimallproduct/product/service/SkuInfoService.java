package com.jiafu.gulimallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.gulimallproduct.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-22 23:25:05
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

