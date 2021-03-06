package com.zing.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zing
 * @date 2019-11-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户 id
     */
    private Long id;

    /**
     * 用户基本信息
     */
    private BaseInfo baseInfo;

    /**
     * 用户额外信息
     */
    private OtherInfo otherInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BaseInfo {
        private String name;
        private Integer age;
        private String gender;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherInfo {
        private String phone;
        private String address;
    }

}
