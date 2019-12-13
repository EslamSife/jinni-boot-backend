package com.jinniservice.backend.entites;

import javax.persistence.*;
import java.util.Date;


// Solution instead of CleanerAvailability


@Entity
@Table(name = "CleanerOrder")
public class CleanerOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "cleaner")
    private Cleaner cleaner;


    @Column(name = "availability")
    private String availability;
    @Column(name = "orderDate")
    private Date orderDate;


    public CleanerOrder() {
    }

    public CleanerOrder(Cleaner cleaner, String availability, Date orderDate) {
        this.cleaner = cleaner;
        this.availability = availability;
        this.orderDate = orderDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public String toString() {
        return "CleanerOrder{" +
                "id=" + id +
                ", availability='" + availability + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
