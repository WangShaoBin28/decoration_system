package com.app.utils;


import lombok.Data;

import java.util.Optional;

/**
 * @Package com.arrail.common.model
 * @ClassName ReturnInfo
 * @Author zhijun.zhao
 * @Date 2018/9/3  20:03
 * @Version 1.0
 * @Description: 数据返回类
 **/
@Data
public class ReturnInfo<T> {
    private int code;
    private T content;
    private String msg;

    public ReturnInfo() {
    }

    public ReturnInfo(int code, T content) {
        this.code = code;
        this.content = content;
    }

    public ReturnInfo(int code, T content, String msg) {
        this.code = code;
        this.content = content;
        this.msg = msg;
    }

    public Optional<ReturnInfo<T>> optional() {
        return Optional.ofNullable(this);
    }

    /**
     * @param status
     * @return com.arrail.common.model.ReturnInfo
     * @author mengmeng.cao
     * @date 2018/12/10 17:19
     * @description: 根据枚举类型返回实体
     */
    public static <T extends Object> ReturnInfo<T> ofStatus(ResponseStatusEnum status) {
        return new ReturnInfo<>(status.getCode(), null, status.getValue());
    }

    /**
     * @param content
     * @return com.arrail.common.model.ReturnInfo<T>
     * @author mengmeng.cao
     * @date 2018/12/10 17:20
     * @description: 处理正确返回
     */
    public static <T extends Object> ReturnInfo<T> ofSuccess(T content) {
        return new ReturnInfo<>(ResponseStatusEnum.OK.getCode(), content);
    }

}
