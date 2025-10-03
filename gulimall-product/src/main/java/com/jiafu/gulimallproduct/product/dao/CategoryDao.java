package com.jiafu.gulimallproduct.product.dao;

import com.jiafu.gulimallproduct.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-22 23:25:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
