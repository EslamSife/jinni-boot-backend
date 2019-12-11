package com.jinniservice.backend.entites;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CleanerNotifications")
public class CleanerNotifications {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "message")
    private String message;
    @Column(name = "userfilter")
    private String userFilter;
    @Column(name = "sent")
    private short sent;
    @Column(name = "senddatetime")
    private Date sendDateTime;
    @Column(name = "createdOn")
    private Date createdOn;
    @Column(name = "createdby")
    private int createdBy;


    public CleanerNotifications() {
    }


    public CleanerNotifications(String message, String userFilter, short sent, Date sendDateTime, Date createdOn, int createdBy) {
        this.message = message;
        this.userFilter = userFilter;
        this.sent = sent;
        this.sendDateTime = sendDateTime;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserFilter() {
        return userFilter;
    }

    public void setUserFilter(String userFilter) {
        this.userFilter = userFilter;
    }

    public short getSent() {
        return sent;
    }

    public void setSent(short sent) {
        this.sent = sent;
    }

    public Date getSendDateTime() {
        return sendDateTime;
    }

    public void setSendDateTime(Date sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public String toString() {
        return "CleanerNotifications{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", userFilter='" + userFilter + '\'' +
                ", sent=" + sent +
                ", sendDateTime=" + sendDateTime +
                ", createdOn=" + createdOn +
                ", createdBy=" + createdBy +
                '}';
    }
}
