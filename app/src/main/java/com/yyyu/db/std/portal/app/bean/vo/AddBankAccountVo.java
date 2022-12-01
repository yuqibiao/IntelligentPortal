package com.yyyu.db.std.portal.app.bean.vo;

/**
 * Created by CS-Yong
 * 2019/7/14  18:29
 */
public class AddBankAccountVo {


    /**
     * bankType : DEBIT
     * bankName : BNI
     * accountNumber : 123456789
     * accountName : spen
     * year : 2019
     * month : 08
     * cvn : 123
     */

    private String bankType;
    private String bankName;
    private String accountNumber;
    private String accountName;
    private String year;
    private String month;
    private String cvn;

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCvn() {
        return cvn;
    }

    public void setCvn(String cvn) {
        this.cvn = cvn;
    }
}
