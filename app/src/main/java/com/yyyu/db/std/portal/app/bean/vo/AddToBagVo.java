package com.yyyu.db.std.portal.app.bean.vo;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2019/7/13
 */
public class AddToBagVo {


    /**
     * type : 1
     * productId : 1
     * itemId : 1
     * num : 1
     * rentDay : 4
     * rentStart : 2019-07-10
     * rentEnd : 2019-07-14
     */

    private int type;
    private int productId;
    private int itemId;
    private int num;
    private int rentDay;
    private String rentStart;
    private String rentEnd;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRentDay() {
        return rentDay;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public String getRentStart() {
        return rentStart;
    }

    public void setRentStart(String rentStart) {
        this.rentStart = rentStart;
    }

    public String getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }
}
