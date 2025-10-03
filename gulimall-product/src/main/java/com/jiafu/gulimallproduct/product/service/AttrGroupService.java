package com.jiafu.gulimallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.gulimallproduct.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-22 23:25:05
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

