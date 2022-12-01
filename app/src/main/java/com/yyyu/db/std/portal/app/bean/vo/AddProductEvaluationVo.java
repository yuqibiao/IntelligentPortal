package com.yyyu.db.std.portal.app.bean.vo;

/**
 * 功能：添加商品评论
 *
 * @author yu
 * @date 2019/7/15
 */
public class AddProductEvaluationVo {
    /**
     * orderId : 20190702000001
     * productId : 1
     * content : 这里是商品评价
     * images : /media/product_evaluation/01.jpg
     * designScore : 7
     * fitScore : 4
     */
    private String orderId;
    private int productId;
    private String content;
    private String images;
    private float designScore;
    private float fitScore;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public float getDesignScore() {
        return designScore;
    }

    public void setDesignScore(float designScore) {
        this.designScore = designScore;
    }

    public float getFitScore() {
        return fitScore;
    }

    public void setFitScore(float fitScore) {
        this.fitScore = fitScore;
    }
}
