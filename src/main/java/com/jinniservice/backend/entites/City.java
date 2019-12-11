package com.jinniservice.backend.entites;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "City")
public class City {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title_en")
    private String title_en;
    @Column(name = "title_ar")
    private String title_ar;
    @Column(name = "createdon")
    private Date createdOn;
    @Column(name = "updatedon")
    private Date updatedOn;
    @Column(name = "updateby")
    private int upDateBy;
    @Column(name = "createdby")
    private int createdBy;


    public City() {
    }

    public City(String title_en, String title_ar, Date createdOn, Date updatedOn, int upDateBy, int createdBy) {
        this.title_en = title_en;
        this.title_ar = title_ar;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.upDateBy = upDateBy;
        this.createdBy = createdBy;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle_en() {
        return title_en;
    }

    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }

    public String getTitle_ar() {
        return title_ar;
    }

    public void setTitle_ar(String title_ar) {
        this.title_ar = title_ar;
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

    public int getUpDateBy() {
        return upDateBy;
    }

    public void setUpDateBy(int upDateBy) {
        this.upDateBy = upDateBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", title_en='" + title_en + '\'' +
                ", title_ar='" + title_ar + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", upDateBy=" + upDateBy +
                ", createdBy=" + createdBy +
                '}';
    }
}
