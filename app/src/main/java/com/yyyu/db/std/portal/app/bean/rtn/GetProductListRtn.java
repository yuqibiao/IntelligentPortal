package com.yyyu.db.std.portal.app.bean.rtn;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2019/7/12
 */
public class GetProductListRtn {

    private DataBean data;
    private String message;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {


        private PageInfoBean pageInfo;
        private List<ListBean> list;

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class PageInfoBean {
            /**
             * page : 1
             * pageSize : 20
             * pageCount : 1
             * total : 1
             */

            private int page;
            private int pageSize;
            private int pageCount;
            private int total;

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getPageCount() {
                return pageCount;
            }

            public void setPageCount(int pageCount) {
                this.pageCount = pageCount;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class ListBean {

            private ProductBean product;
            private BrandBean brand;
            private Object evaluationList;
            private Object recommendList;
            private ScoreBean score;
            private List<SizeListBean> sizeList;
            private List<ItemListBean> itemList;

            public ProductBean getProduct() {
                return product;
            }

            public void setProduct(ProductBean product) {
                this.product = product;
            }

            public BrandBean getBrand() {
                return brand;
            }

            public void setBrand(BrandBean brand) {
                this.brand = brand;
            }

            public Object getEvaluationList() {
                return evaluationList;
            }

            public void setEvaluationList(Object evaluationList) {
                this.evaluationList = evaluationList;
            }

            public Object getRecommendList() {
                return recommendList;
            }

            public void setRecommendList(Object recommendList) {
                this.recommendList = recommendList;
            }

            public ScoreBean getScore() {
                return score;
            }

            public void setScore(ScoreBean score) {
                this.score = score;
            }

            public List<SizeListBean> getSizeList() {
                return sizeList;
            }

            public void setSizeList(List<SizeListBean> sizeList) {
                this.sizeList = sizeList;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class ProductBean {
                /**
                 * id : 1
                 * type : 1
                 * supplierId : 0
                 * supplierName :
                 * categoryId : 1
                 * categoryCode :
                 * categoryName :
                 * brandId : 1
                 * brandName :
                 * title : 测试商品063001
                 * subTitle : 商品副标题
                 * image : /media/product_item/20190612/33.jpg
                 * thumb :
                 * images : /media/product_item/20190612/33.jpg
                 * details : /media/product_item/20190612/33.jpg
                 * description : <p>                 <img src="http://118.31.43.223:18081/media/undefined/20190612/37.jpg"></p><p>商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品详情商品商品商品详情商品</p><p>           <img src="http://118.31.43.223:18081/media/undefined/20190708/335.jpg"></p>
                 * rentPrice : 10000
                 * vipRentPrice : 0
                 * sellPrice : 10000
                 * retailPrice : 10000
                 * maxRentPrice : 10000
                 * maxVipRentPrice : 0
                 * maxSellPrice : 0
                 * maxRetailPrice : 0
                 * sellStart : 2019-06-30T02:31:35.522+08:00
                 * sellEnd : 2019-07-31T02:31:41.981+08:00
                 * leftNum : 92
                 * soldNum : 0
                 * rentNum : 0
                 * selling : 0
                 * rentingNum : 9
                 * frozenNum : 3
                 * status : 1
                 * rentFlag : 1
                 * vipRentFlag : 0
                 * sellFlag : 0
                 * sortWeight : 0
                 * tags : ["极简风"]
                 * sizePropName : null
                 * isRecommend : true
                 * createTime : 2019-07-01T02:33:51.295+08:00
                 * updateTime : 2019-07-01T02:33:53.693+08:00
                 * isUserLiked : false
                 */

                private int id;
                private String type;
                private int supplierId;
                private String supplierName;
                private int categoryId;
                private String categoryCode;
                private String categoryName;
                private int brandId;
                private String brandName;
                private String title;
                private String subTitle;
                private String image;
                private String thumb;
                private String images;
                private String details;
                private String description;
                private int rentPrice;
                private int vipRentPrice;
                private int sellPrice;
                private int retailPrice;
                private int maxRentPrice;
                private int maxVipRentPrice;
                private int maxSellPrice;
                private int maxRetailPrice;
                private String sellStart;
                private String sellEnd;
                private int leftNum;
                private int soldNum;
                private int rentNum;
                private int selling;
                private int rentingNum;
                private int frozenNum;
                private int status;
                private int rentFlag;
                private int vipRentFlag;
                private int sellFlag;
                private int sortWeight;
                private Object sizePropName;
                private boolean isRecommend;
                private String createTime;
                private String updateTime;
                private boolean isUserLiked;
                private List<String> tags;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getSupplierId() {
                    return supplierId;
                }

                public void setSupplierId(int supplierId) {
                    this.supplierId = supplierId;
                }

                public String getSupplierName() {
                    return supplierName;
                }

                public void setSupplierName(String supplierName) {
                    this.supplierName = supplierName;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public String getCategoryCode() {
                    return categoryCode;
                }

                public void setCategoryCode(String categoryCode) {
                    this.categoryCode = categoryCode;
                }

                public String getCategoryName() {
                    return categoryName;
                }

                public void setCategoryName(String categoryName) {
                    this.categoryName = categoryName;
                }

                public int getBrandId() {
                    return brandId;
                }

                public void setBrandId(int brandId) {
                    this.brandId = brandId;
                }

                public String getBrandName() {
                    return brandName;
                }

                public void setBrandName(String brandName) {
                    this.brandName = brandName;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(String subTitle) {
                    this.subTitle = subTitle;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getThumb() {
                    return thumb;
                }

                public void setThumb(String thumb) {
                    this.thumb = thumb;
                }

                public String getImages() {
                    return images;
                }

                public void setImages(String images) {
                    this.images = images;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getRentPrice() {
                    return rentPrice;
                }

                public void setRentPrice(int rentPrice) {
                    this.rentPrice = rentPrice;
                }

                public int getVipRentPrice() {
                    return vipRentPrice;
                }

                public void setVipRentPrice(int vipRentPrice) {
                    this.vipRentPrice = vipRentPrice;
                }

                public int getSellPrice() {
                    return sellPrice;
                }

                public void setSellPrice(int sellPrice) {
                    this.sellPrice = sellPrice;
                }

                public int getRetailPrice() {
                    return retailPrice;
                }

                public void setRetailPrice(int retailPrice) {
                    this.retailPrice = retailPrice;
                }

                public int getMaxRentPrice() {
                    return maxRentPrice;
                }

                public void setMaxRentPrice(int maxRentPrice) {
                    this.maxRentPrice = maxRentPrice;
                }

                public int getMaxVipRentPrice() {
                    return maxVipRentPrice;
                }

                public void setMaxVipRentPrice(int maxVipRentPrice) {
                    this.maxVipRentPrice = maxVipRentPrice;
                }

                public int getMaxSellPrice() {
                    return maxSellPrice;
                }

                public void setMaxSellPrice(int maxSellPrice) {
                    this.maxSellPrice = maxSellPrice;
                }

                public int getMaxRetailPrice() {
                    return maxRetailPrice;
                }

                public void setMaxRetailPrice(int maxRetailPrice) {
                    this.maxRetailPrice = maxRetailPrice;
                }

                public String getSellStart() {
                    return sellStart;
                }

                public void setSellStart(String sellStart) {
                    this.sellStart = sellStart;
                }

                public String getSellEnd() {
                    return sellEnd;
                }

                public void setSellEnd(String sellEnd) {
                    this.sellEnd = sellEnd;
                }

                public int getLeftNum() {
                    return leftNum;
                }

                public void setLeftNum(int leftNum) {
                    this.leftNum = leftNum;
                }

                public int getSoldNum() {
                    return soldNum;
                }

                public void setSoldNum(int soldNum) {
                    this.soldNum = soldNum;
                }

                public int getRentNum() {
                    return rentNum;
                }

                public void setRentNum(int rentNum) {
                    this.rentNum = rentNum;
                }

                public int getSelling() {
                    return selling;
                }

                public void setSelling(int selling) {
                    this.selling = selling;
                }

                public int getRentingNum() {
                    return rentingNum;
                }

                public void setRentingNum(int rentingNum) {
                    this.rentingNum = rentingNum;
                }

                public int getFrozenNum() {
                    return frozenNum;
                }

                public void setFrozenNum(int frozenNum) {
                    this.frozenNum = frozenNum;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getRentFlag() {
                    return rentFlag;
                }

                public void setRentFlag(int rentFlag) {
                    this.rentFlag = rentFlag;
                }

                public int getVipRentFlag() {
                    return vipRentFlag;
                }

                public void setVipRentFlag(int vipRentFlag) {
                    this.vipRentFlag = vipRentFlag;
                }

                public int getSellFlag() {
                    return sellFlag;
                }

                public void setSellFlag(int sellFlag) {
                    this.sellFlag = sellFlag;
                }

                public int getSortWeight() {
                    return sortWeight;
                }

                public void setSortWeight(int sortWeight) {
                    this.sortWeight = sortWeight;
                }

                public Object getSizePropName() {
                    return sizePropName;
                }

                public void setSizePropName(Object sizePropName) {
                    this.sizePropName = sizePropName;
                }

                public boolean isIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(boolean isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }

                public boolean isIsUserLiked() {
                    return isUserLiked;
                }

                public void setIsUserLiked(boolean isUserLiked) {
                    this.isUserLiked = isUserLiked;
                }

                public List<String> getTags() {
                    return tags;
                }

                public void setTags(List<String> tags) {
                    this.tags = tags;
                }
            }

            public static class BrandBean {
                /**
                 * id : 0
                 * name :
                 * categoryId : 0
                 * categoryCode :
                 * categoryName :
                 * tags : null
                 * logo :
                 * banner :
                 * images :
                 * description :
                 * status : 0
                 * sortNum : 0
                 * createTime : 0001-01-01T00:00:00Z
                 * updateTime : 0001-01-01T00:00:00Z
                 */

                private int id;
                private String name;
                private int categoryId;
                private String categoryCode;
                private String categoryName;
                private Object tags;
                private String logo;
                private String banner;
                private String images;
                private String description;
                private int status;
                private int sortNum;
                private String createTime;
                private String updateTime;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public String getCategoryCode() {
                    return categoryCode;
                }

                public void setCategoryCode(String categoryCode) {
                    this.categoryCode = categoryCode;
                }

                public String getCategoryName() {
                    return categoryName;
                }

                public void setCategoryName(String categoryName) {
                    this.categoryName = categoryName;
                }

                public Object getTags() {
                    return tags;
                }

                public void setTags(Object tags) {
                    this.tags = tags;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getBanner() {
                    return banner;
                }

                public void setBanner(String banner) {
                    this.banner = banner;
                }

                public String getImages() {
                    return images;
                }

                public void setImages(String images) {
                    this.images = images;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getSortNum() {
                    return sortNum;
                }

                public void setSortNum(int sortNum) {
                    this.sortNum = sortNum;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }
            }

            public static class ScoreBean {
                /**
                 * id : 0
                 * totalNum : 0
                 * designNum : 0
                 * designScore : 0
                 * fitNum : 0
                 * fitScore : 0
                 * fitTightNum : 0
                 * fitGoodNum : 0
                 * fitLooseNum : 0
                 */

                private int id;
                private int totalNum;
                private int designNum;
                private int designScore;
                private int fitNum;
                private int fitScore;
                private int fitTightNum;
                private int fitGoodNum;
                private int fitLooseNum;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getTotalNum() {
                    return totalNum;
                }

                public void setTotalNum(int totalNum) {
                    this.totalNum = totalNum;
                }

                public int getDesignNum() {
                    return designNum;
                }

                public void setDesignNum(int designNum) {
                    this.designNum = designNum;
                }

                public int getDesignScore() {
                    return designScore;
                }

                public void setDesignScore(int designScore) {
                    this.designScore = designScore;
                }

                public int getFitNum() {
                    return fitNum;
                }

                public void setFitNum(int fitNum) {
                    this.fitNum = fitNum;
                }

                public int getFitScore() {
                    return fitScore;
                }

                public void setFitScore(int fitScore) {
                    this.fitScore = fitScore;
                }

                public int getFitTightNum() {
                    return fitTightNum;
                }

                public void setFitTightNum(int fitTightNum) {
                    this.fitTightNum = fitTightNum;
                }

                public int getFitGoodNum() {
                    return fitGoodNum;
                }

                public void setFitGoodNum(int fitGoodNum) {
                    this.fitGoodNum = fitGoodNum;
                }

                public int getFitLooseNum() {
                    return fitLooseNum;
                }

                public void setFitLooseNum(int fitLooseNum) {
                    this.fitLooseNum = fitLooseNum;
                }
            }

            public static class SizeListBean {
                /**
                 * id : 1
                 * productId : 1
                 * size : s
                 * fitness :
                 * propValues : null
                 * sortNum : 0
                 */

                private int id;
                private int productId;
                private String size;
                private String fitness;
                private Object propValues;
                private int sortNum;

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

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getFitness() {
                    return fitness;
                }

                public void setFitness(String fitness) {
                    this.fitness = fitness;
                }

                public Object getPropValues() {
                    return propValues;
                }

                public void setPropValues(Object propValues) {
                    this.propValues = propValues;
                }

                public int getSortNum() {
                    return sortNum;
                }

                public void setSortNum(int sortNum) {
                    this.sortNum = sortNum;
                }
            }

            public static class ItemListBean {
                /**
                 * id : 1
                 * productId : 1
                 * barCode :
                 * image : /media/product_item/20190612/33.jpg
                 * color : #000000
                 * size : s
                 * rentPrice : 10000
                 * vipRentPrice : 0
                 * sellPrice : 10000
                 * retailPrice : 10000
                 * leftNum : 94
                 * soldNum : 0
                 * rentNum : 0
                 * selling : 0
                 * rentingNum : 7
                 * frozenNum : 1
                 */

                private int id;
                private int productId;
                private String barCode;
                private String image;
                private String color;
                private String size;
                private int rentPrice;
                private int vipRentPrice;
                private int sellPrice;
                private int retailPrice;
                private int leftNum;
                private int soldNum;
                private int rentNum;
                private int selling;
                private int rentingNum;
                private int frozenNum;

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

                public String getBarCode() {
                    return barCode;
                }

                public void setBarCode(String barCode) {
                    this.barCode = barCode;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public int getRentPrice() {
                    return rentPrice;
                }

                public void setRentPrice(int rentPrice) {
                    this.rentPrice = rentPrice;
                }

                public int getVipRentPrice() {
                    return vipRentPrice;
                }

                public void setVipRentPrice(int vipRentPrice) {
                    this.vipRentPrice = vipRentPrice;
                }

                public int getSellPrice() {
                    return sellPrice;
                }

                public void setSellPrice(int sellPrice) {
                    this.sellPrice = sellPrice;
                }

                public int getRetailPrice() {
                    return retailPrice;
                }

                public void setRetailPrice(int retailPrice) {
                    this.retailPrice = retailPrice;
                }

                public int getLeftNum() {
                    return leftNum;
                }

                public void setLeftNum(int leftNum) {
                    this.leftNum = leftNum;
                }

                public int getSoldNum() {
                    return soldNum;
                }

                public void setSoldNum(int soldNum) {
                    this.soldNum = soldNum;
                }

                public int getRentNum() {
                    return rentNum;
                }

                public void setRentNum(int rentNum) {
                    this.rentNum = rentNum;
                }

                public int getSelling() {
                    return selling;
                }

                public void setSelling(int selling) {
                    this.selling = selling;
                }

                public int getRentingNum() {
                    return rentingNum;
                }

                public void setRentingNum(int rentingNum) {
                    this.rentingNum = rentingNum;
                }

                public int getFrozenNum() {
                    return frozenNum;
                }

                public void setFrozenNum(int frozenNum) {
                    this.frozenNum = frozenNum;
                }
            }
        }
    }
}
