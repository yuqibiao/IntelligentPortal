package com.yyyu.db.std.portal.app.bean.vo;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2019/7/28
 */
public class PayByCreditCardVo {

    /**
     * orderId : 20190702000001
     * tokenId : 5d1b1cde1b31bc0a8b9d0e8f
     * authenticationId : 5d1b1cde1b31bc0a8b9d0e90
     * cardCvn : 123
     */

    private String orderId;
    private String tokenId;
    private String authenticationId;
    private String cardCvn;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public String getCardCvn() {
        return cardCvn;
    }

    public void setCardCvn(String cardCvn) {
        this.cardCvn = cardCvn;
    }
}
