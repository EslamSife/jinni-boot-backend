package com.jinniservice.backend.entites;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Appversion")
public class AppVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "customers_ios")
    private String customers_ios;
    @Column(name = "customers_android")
    private String customers_android;
    @Column(name = "servity_customers_ios")
    private short servity_customers_ios;
    @Column(name = "servity_customers_android")
    private short servity_customers_android;
    @Column(name = "createdon")
    private Date createdOn;
    @Column(name = "updatedon")
    private Date updatedOn;
    @Column(name = "updatedby")
    private int updatedBy;


    public AppVersion() {

    }


    public AppVersion(String customers_ios, String customers_android, short servity_customers_ios, short servity_customers_android, Date createdOn, Date updatedOn, int updatedBy) {
        this.customers_ios = customers_ios;
        this.customers_android = customers_android;
        this.servity_customers_ios = servity_customers_ios;
        this.servity_customers_android = servity_customers_android;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomers_ios() {
        return customers_ios;
    }

    public void setCustomers_ios(String customers_ios) {
        this.customers_ios = customers_ios;
    }

    public String getCustomers_android() {
        return customers_android;
    }

    public void setCustomers_android(String customers_android) {
        this.customers_android = customers_android;
    }

    public short getServity_customers_ios() {
        return servity_customers_ios;
    }

    public void setServity_customers_ios(short servity_customers_ios) {
        this.servity_customers_ios = servity_customers_ios;
    }

    public short getServity_customers_android() {
        return servity_customers_android;
    }

    public void setServity_customers_android(short servity_customers_android) {
        this.servity_customers_android = servity_customers_android;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }


    @Override
    public String toString() {
        return "AppVersion{" +
                "id=" + id +
                ", customers_ios='" + customers_ios + '\'' +
                ", customers_android='" + customers_android + '\'' +
                ", servity_customers_ios=" + servity_customers_ios +
                ", servity_customers_android=" + servity_customers_android +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
