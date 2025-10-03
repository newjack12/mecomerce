package com.jiafu.gulimallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.gulimallware.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 09:22:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

