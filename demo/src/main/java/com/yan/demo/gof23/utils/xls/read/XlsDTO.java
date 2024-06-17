package com.yan.demo.gof23.utils.xls.read;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;

/**
 * @since 2024/3/14 11:16
 */
public class XlsDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 手机号码
     */
    @ExcelProperty("手机号码*")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}