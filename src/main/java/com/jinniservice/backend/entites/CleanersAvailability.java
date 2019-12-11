package com.jinniservice.backend.entites;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CleanersAvailability")
public class CleanersAvailability {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "cleanerid")
    private Cleaner cleanerId;
    @Column(name = "availability")
    private String availability;
    @Column(name = "availabledate")
    private Date availableDate;


    public CleanersAvailability() {
    }

    public CleanersAvailability(Cleaner cleanerId, String availability, Date availableDate) {
        this.cleanerId = cleanerId;
        this.availability = availability;
        this.availableDate = availableDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cleaner getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(Cleaner cleanerId) {
        this.cleanerId = cleanerId;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }


    @Override
    public String toString() {
        return "CleanersAvailability{" +
                "id=" + id +
                ", cleanerId=" + cleanerId +
                ", availability='" + availability + '\'' +
                ", availableDate=" + availableDate +
                '}';
    }
}
