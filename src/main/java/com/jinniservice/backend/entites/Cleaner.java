package com.jinniservice.backend.entites;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Cleaner")
public class Cleaner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "phone")
    private String phone;


    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "nationalid")
    private String nationalId;

    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "profilepicture")
    private String profilePicture;


    @Column(name = "isratereset")
    private int isRateReset;


    @Column(name = "rateresetdate")
    private Date rateResetDate;


    @Column(name = "rate")
    private float rate;


    @Column(name = "isactive")
    private int isActive;


    @Column(name = "cleaner_rank")
    private int rank;

    @Column(name = "platform")
    private int platform;


    @Column(name = "platformtoken")
    private long platFormToken;

    @Column(name = "createdon")
    private Date createdOn;

    @Column(name = "createdby")
    private int createdBy;


    @Column(name = "updatedon")
    private Date updatedOn;


    @Column(name = "updatedby")
    private int updatedBy;


    public Cleaner() {

    }


    public Cleaner(String fullName, String phone, String email, String password, Date rateresetdate,
                    String nationalId, Date birthDate, String profilePicture, int isRateReset, int isActive, int platform, long platFormToken,
                    Date createdOn, int createdBy, int updatedBy, Date updatedOn, float rate, int rank) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.nationalId = nationalId;
        this.birthDate = birthDate;
        this.profilePicture = profilePicture;
        this.isRateReset = isRateReset;
        this.isActive = isActive;
        this.platform = platform;
        this.platFormToken = platFormToken;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.rateResetDate = rateresetdate;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.rate = rate;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "Cleaner{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", birthDate=" + birthDate +
                ", profilePicture='" + profilePicture + '\'' +
                ", isRateReset=" + isRateReset +
                ", rateResetDate=" + rateResetDate +
                ", rate=" + rate +
                ", isActive=" + isActive +
                ", rank=" + rank +
                ", platform=" + platform +
                ", platFormToken=" + platFormToken +
                ", createdOn=" + createdOn +
                ", createdBy=" + createdBy +
                ", updatedOn=" + updatedOn +
                ", updatedBy=" + updatedBy +
                '}';
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }



    public int getIsRateReset() {
        return isRateReset;
    }

    public void setIsRateReset(int isRateReset) {
        this.isRateReset = isRateReset;
    }


    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public long getPlatFormToken() {
        return platFormToken;
    }

    public void setPlatFormToken(long platFormToken) {
        this.platFormToken = platFormToken;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
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


    public Date getRateResetDate() {
        return rateResetDate;
    }

    public void setRateResetDate(Date rateResetDate) {
        this.rateResetDate = rateResetDate;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }



    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public float getRate() {
        return rate;
    }


    public void setRate(float rate) {
        this.rate = rate;
    }


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
