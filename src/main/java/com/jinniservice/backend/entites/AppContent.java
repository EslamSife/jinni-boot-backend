package com.jinniservice.backend.entites;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AppContent")
public class AppContent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int appContentId;
    @Column(name = "screen")
    private String screen;
    @Column(name = "filed")
    private String filed;
    @Column(name = "value")
    private String value;
    @Column(name = "createdon")
    private Date createdOn;
    @Column(name = "updatedon")
    private Date updatedOn;
    @Column(name = "updatedby")
    private int updatedBy;


    public AppContent() {

    }


    public AppContent(String screen, String filed, String value, Date createdOn, Date updatedOn, int updatedBy) {
        this.screen = screen;
        this.filed = filed;
        this.value = value;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }


    public int getAppContentId() {
        return appContentId;
    }

    public void setAppContentId(int appContentId) {
        this.appContentId = appContentId;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        return "AppContent{" +
                "appContentId=" + appContentId +
                ", screen='" + screen + '\'' +
                ", filed='" + filed + '\'' +
                ", value='" + value + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
