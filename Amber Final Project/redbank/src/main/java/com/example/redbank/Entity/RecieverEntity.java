package com.example.redbank.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reciever_table")
public class RecieverEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recieverId;

    private String recieverName;
    private String recieverGender;
    private Date recieverDob;
    private Long recieverMobileNo;
    private String recieverEmailId;
    private String recieverBloodGroup;
    private int recieverBloodUnit;
    private String recieverAddress;
    
    @ManyToOne
    @JsonBackReference
    private BloodGroupEntity bloodgroupEntity;

    public int getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(int recieverId) {
        this.recieverId = recieverId;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public String getRecieverGender() {
        return recieverGender;
    }

    public void setRecieverGender(String recieverGender) {
        this.recieverGender = recieverGender;
    }

    public Date getRecieverDob() {
        return recieverDob;
    }

    public void setRecieverDob(Date recieverDob) {
        this.recieverDob = recieverDob;
    }

    public Long getRecieverMobileNo() {
        return recieverMobileNo;
    }

    public void setRecieverMobileNo(Long recieverMobileNo) {
        this.recieverMobileNo = recieverMobileNo;
    }

    public String getRecieverEmailId() {
        return recieverEmailId;
    }

    public void setRecieverEmailId(String recieverEmailId) {
        this.recieverEmailId = recieverEmailId;
    }

    public String getRecieverBloodGroup() {
        return recieverBloodGroup;
    }

    public void setRecieverBloodGroup(String recieverBloodGroup) {
        this.recieverBloodGroup = recieverBloodGroup;
    }

    public int getRecieverBloodUnit() {
        return recieverBloodUnit;
    }

    public void setRecieverBloodUnit(int recieverBloodUnit) {
        this.recieverBloodUnit = recieverBloodUnit;
    }

    public String getRecieverAddress() {
        return recieverAddress;
    }

    public void setRecieverAddress(String recieverAddress) {
        this.recieverAddress = recieverAddress;
    }

    public BloodGroupEntity getBloodgroupEntity() {
        return bloodgroupEntity;
    }

    public void setBloodgroupEntity(BloodGroupEntity bloodgroupEntity) {
        this.bloodgroupEntity = bloodgroupEntity;
    }

    public RecieverEntity() {
    }

    public RecieverEntity(int recieverId, String recieverName, String recieverGender, Date recieverDob, Long recieverMobileNo, String recieverEmailId, String recieverBloodGroup, int recieverBloodUnit, String recieverAddress, BloodGroupEntity bloodgroupEntity) {
        this.recieverId = recieverId;
        this.recieverName = recieverName;
        this.recieverGender = recieverGender;
        this.recieverDob = recieverDob;
        this.recieverMobileNo = recieverMobileNo;
        this.recieverEmailId = recieverEmailId;
        this.recieverBloodGroup = recieverBloodGroup;
        this.recieverBloodUnit = recieverBloodUnit;
        this.recieverAddress = recieverAddress;
        this.bloodgroupEntity = bloodgroupEntity;
    }

    @Override
    public String toString() {
        return "RecieverEntity{" +
                "recieverId=" + recieverId +
                ", recieverName='" + recieverName + '\'' +
                ", recieverGender='" + recieverGender + '\'' +
                ", recieverDob=" + recieverDob +
                ", recieverMobileNo=" + recieverMobileNo +
                ", recieverEmailId='" + recieverEmailId + '\'' +
                ", recieverBloodGroup='" + recieverBloodGroup + '\'' +
                ", recieverBloodUnit=" + recieverBloodUnit +
                ", recieverAddress='" + recieverAddress + '\'' +
                ", bloodgroupEntity=" + bloodgroupEntity +
                '}';
    }
}