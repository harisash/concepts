package com.mine.oopConcepts.abstration;

import java.util.Date;

public abstract class Charging {
    private long msisdn;
    private Integer operatorId;
    private Integer vendorPlanId;
    private String correlationId;
    private Date originDateTime;
    private Double chargingAmount;
    private String shortcode;
    private Double taxAmount;
    private double shareAmount;
    private int attempts;
    private int isRenewal;
    private int dailyAttempts;
    private int subCycleId;
    private boolean isDcb;

    public long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getVendorPlanId() {
        return vendorPlanId;
    }

    public void setVendorPlanId(Integer vendorPlanId) {
        this.vendorPlanId = vendorPlanId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Date getOriginDateTime() {
        return originDateTime;
    }

    public void setOriginDateTime(Date originDateTime) {
        this.originDateTime = originDateTime;
    }

    public Double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(Double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(double shareAmount) {
        this.shareAmount = shareAmount;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getIsRenewal() {
        return isRenewal;
    }

    public void setIsRenewal(int isRenewal) {
        this.isRenewal = isRenewal;
    }

    public int getDailyAttempts() {
        return dailyAttempts;
    }

    public void setDailyAttempts(int dailyAttempts) {
        this.dailyAttempts = dailyAttempts;
    }

    public int getSubCycleId() {
        return subCycleId;
    }

    public void setSubCycleId(int subCycleId) {
        this.subCycleId = subCycleId;
    }

    public boolean isDcb() {
        return isDcb;
    }

    public void setDcb(boolean dcb) {
        isDcb = dcb;
    }

    public abstract String charge();
}
