package com.jinniservice.backend.entites;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Role")
public class Role {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "roleName")
    private String roleName;
    @Column(name = "permission")
    private String permission;
    @Column(name = "createdOn")
    private Date createdOn;
    @Column(name = "updatedOn")
    private Date updatedOn;
    @Column(name = "updatedBy")
    private int updatedBy;

}
