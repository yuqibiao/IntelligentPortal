package com.yyyu.db.std.portal.app.bean.vo;

import java.util.List;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2019/7/14
 */
public class CreateOrderVo {

    private OrderInfoBean orderInfo;
    private int addressId;
    private boolean fromCart;
    private List<ItemListBean> itemList;

    public OrderInfoBean getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfoBean orderInfo) {
        this.orderInfo = orderInfo;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public boolean isFromCart() {
        return fromCart;
    }

    public void setFromCart(boolean fromCart) {
        this.fromCart = fromCart;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class OrderInfoBean {
        /**
         * type : 10
         * rentStart : 2019-06-30
         * rentEnd : 2019-07-04
         */

        private int type;
        private String rentStart;
        private String rentEnd;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
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

    public static class ItemListBean {
        /**
         * id : 12 // 购物车下单需传购物车id
         * productId : 1
         * itemId : 1
         * size : s
         * num : 1
         */

        private int id;
        private int productId;
        private int itemId;
        private String size;
        private int num;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
