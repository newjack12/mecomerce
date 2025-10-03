package com.jiafu.gulimallmember.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.jiafu.gulimallmember.member.feign.CouponFeignService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jiafu.gulimallmember.member.entity.MemberEntity;
import com.jiafu.gulimallmember.member.service.MemberService;
import com.jiafu.common.utils.PageUtils;
import com.jiafu.common.utils.R;



/**
 * 会员
 *
 * @author liu jiafu
 * @email mon2424235064@outlook.com
 * @date 2025-09-23 00:06:33
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 列表
     */
    @Autowired
    CouponFeignService couponFeignService;
     @RequestMapping("/coupon")
     public R Test(){
         MemberEntity memberEntity = new MemberEntity();
         memberEntity.setNickname("xiaosan");
         R membercoupons=couponFeignService.memberCoupon();

         return R.ok().put("member", memberEntity).put("coupons",membercoupons.get("coupons"));

     }

    @RequestMapping("/list")
    @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
