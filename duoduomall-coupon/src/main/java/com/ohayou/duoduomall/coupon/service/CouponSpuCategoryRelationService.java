package com.ohayou.duoduomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ohayou.common.utils.PageUtils;
import com.ohayou.duoduomall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 13:58:35
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

