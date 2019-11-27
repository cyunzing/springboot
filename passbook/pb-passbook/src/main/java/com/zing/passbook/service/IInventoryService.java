package com.zing.passbook.service;

import com.zing.passbook.vo.Response;

/**
 * 获取库存信息: 只返回用户没有领取的, 即优惠券库存功能实现接口定义
 *
 * @author Zing
 * @date 2019-11-27
 */
public interface IInventoryService {

    /**
     * <h2>获取库存信息</h2>
     *
     * @param userId 用户 id
     * @return {@link Response}
     */
    Response getInventoryInfo(Long userId) throws Exception;

}
