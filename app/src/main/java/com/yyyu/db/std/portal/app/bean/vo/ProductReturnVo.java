package com.yyyu.db.std.portal.app.bean.vo;

/**
 * 功能：预约归还
 *
 * @author yu
 * @date 2019/7/15
 */
public class ProductReturnVo {


    /**
     * orderId : 20190709000001
     * addressId : 1
     * scheduleTime : 2019-07-10 15:00
     */

    private String orderId;
    private int addressId;
    private String scheduleTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
}
