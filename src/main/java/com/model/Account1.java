package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by debasish paul on 10-11-2017.
 */
@Entity
public class Account1 {
    @Id
    private String accountId;
    private String account;
    private String currency;
    private String dailyChange;
    private String internalRating;

    public Account1(String accountId, String account, String currency, String dailyChange, String internalRating) {
        this.accountId = accountId;
        this.account = account;
        this.currency = currency;
        this.dailyChange = dailyChange;
        this.internalRating = internalRating;
    }

    public Account1() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDailyChange() {
        return dailyChange;
    }

    public void setDailyChange(String dailyChange) {
        this.dailyChange = dailyChange;
    }

    public String getInternalRating() {
        return internalRating;
    }

    public void setInternalRating(String internalRating) {
        this.internalRating = internalRating;
    }

    @Override
    public String toString() {
        return "Account1:{" +
                "accountId:" +accountId+","+
                "account:" +account+","+
                "currency:" + currency +","+
                "dailyChange:" +dailyChange+","+
                "internalRating:" +internalRating+
                "}";
    }
}
