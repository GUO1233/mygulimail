package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author guoyf
 * @email guoyf@gmail.com
 * @date 2023-03-19 00:03:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
