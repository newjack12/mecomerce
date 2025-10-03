package com.jiafu.gulimallorder.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jiafu.gulimallorder.order.entity.MqMessageEntity;
import com.jiafu.gulimallorder.order.service.MqMessageService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.common.utils.R;



/**
 * 
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 09:27:35
 */
@RestController
@RequestMapping("order/mqmessage")
public class MqMessageController {
    @Autowired
    private MqMessageService mqMessageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("order:mqmessage:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = mqMessageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{messageId}")
    @RequiresPermissions("order:mqmessage:info")
    public R info(@PathVariable("messageId") String messageId){
		MqMessageEntity mqMessage = mqMessageService.getById(messageId);

        return R.ok().put("mqMessage", mqMessage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("order:mqmessage:save")
    public R save(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.save(mqMessage);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("order:mqmessage:update")
    public R update(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.updateById(mqMessage);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("order:mqmessage:delete")
    public R delete(@RequestBody String[] messageIds){
		mqMessageService.removeByIds(Arrays.asList(messageIds));

        return R.ok();
    }

}
