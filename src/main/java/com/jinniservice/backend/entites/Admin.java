package com.jinniservice.backend.entites;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int adminId;
    @Column(name = "username")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "issuperadmin")
    private  short isSuperAdmin;
    @Column(name = "canmanagersuper")
    private short canManagerSuper;
    /*
    @Column(name = "roleid")
    private List<Role> roleId;

    */
    @Column(name = "isactive")
    private short isactive;
    @Column(name = "createdon")
    private Date createdOn;
    @Column(name = "updatedon")
    private Date updatedOn;
    @Column(name = "createdBy")
    private int createdBy;
    @Column(name = "updatedby")
    private int updatedby;


    public Admin() {

    }


    public Admin(String userName, String firstName, String lastName, String email, String password, short isSuperAdmin, short canManagerSuper, List<Role> roleId, short isactive, Date createdOn, Date updatedOn, int createdBy, int updatedby) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isSuperAdmin = isSuperAdmin;
        this.canManagerSuper = canManagerSuper;
       // this.roleId = roleId;
        this.isactive = isactive;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.createdBy = createdBy;
        this.updatedby = updatedby;
    }


    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(short isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    public short getCanManagerSuper() {
        return canManagerSuper;
    }

    public void setCanManagerSuper(short canManagerSuper) {
        this.canManagerSuper = canManagerSuper;
    }

    /*
    public List<Role> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Role> roleId) {
        this.roleId = roleId;
    }
*/
    public short getIsactive() {
        return isactive;
    }

    public void setIsactive(short isactive) {
        this.isactive = isactive;
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

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(int updatedby) {
        this.updatedby = updatedby;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isSuperAdmin=" + isSuperAdmin +
                ", canManagerSuper=" + canManagerSuper +
               // ", roleId=" + roleId +
                ", isactive=" + isactive +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", createdBy=" + createdBy +
                ", updatedby=" + updatedby +
                '}';
    }
}
