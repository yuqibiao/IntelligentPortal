package com.yyyu.db.std.portal.app.bean.vo;

/**
 * Created by CS-Yong
 * 2019/7/14  15:53
 */
public class AddAddressVo {

    /**
     * country :
     * province :
     * city :
     * district :
     * address : Jl. Salangga, Lalolara, Kambu, Kota Kendari, Sulawesi Tenggara 93114
     * person : spen
     * phone : 812-8962-0490
     * longitude : 106.9119382
     * latitude : -6.2739117
     * tag : HOME
     */

    private String country;
    private String province;
    private String city;
    private String district;
    private String address;
    private String person;
    private String phone;
    private double longitude;
    private double latitude;
    private String tag;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
