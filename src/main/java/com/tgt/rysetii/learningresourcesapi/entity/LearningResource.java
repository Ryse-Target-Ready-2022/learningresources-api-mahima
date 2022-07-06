package com.tgt.rysetii.learningresourcesapi.entity;

import java.time.LocalDate;

public class LearningResource {
    private Integer ID;
    private String productName;
    private Double costPrice;
    private Double sellingPrice;
    private LearningResourceStatus learningResourcestatus;
    private LocalDate createdDate;
    private LocalDate publishedDate;
    private LocalDate retiredDate;

    public LearningResource()
    {}

    public LearningResource(Integer ID, String productName, Double costPrice, Double sellingPrice, LearningResourceStatus learningResourcestatus, LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
        this.ID = ID;
        this.productName = productName;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.learningResourcestatus = learningResourcestatus;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.retiredDate = retiredDate;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public LearningResourceStatus getLearningResourcestatus() {
        return learningResourcestatus;
    }

    public void setLearningResourcestatus(LearningResourceStatus learningResourcestatus) {
        this.learningResourcestatus = learningResourcestatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(LocalDate retiredDate) {
        this.retiredDate = retiredDate;
    }
}

