package com.example.redbank.Entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="donor_table")
public class DonorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int donorId;

    private String donorName;
    private String donorGender;
    private Date donorDob;
    private Long donorMobileNo;
    private String donorEmailId;
    private String donorBloodGroup;
    private String donorAddress;
    private int donorBloodUnit;

    @ManyToOne
    @JsonBackReference
    private BloodGroupEntity bloodGroupEntity;

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public Date getDonorDob() {
        return donorDob;
    }

    public void setDonorDob(Date donorDob) {
        this.donorDob = donorDob;
    }

    public Long getDonorMobileNo() {
        return donorMobileNo;
    }

    public void setDonorMobileNo(Long donorMobileNo) {
        this.donorMobileNo = donorMobileNo;
    }

    public String getDonorEmailId() {
        return donorEmailId;
    }

    public void setDonorEmailId(String donorEmailId) {
        this.donorEmailId = donorEmailId;
    }

    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public int getDonorBloodUnit() {
        return donorBloodUnit;
    }

    public void setDonorBloodUnit(int donorBloodUnit) {
        this.donorBloodUnit = donorBloodUnit;
    }

    public BloodGroupEntity getBloodGroupEntity() {
        return bloodGroupEntity;
    }

    public void setBloodGroupEntity(BloodGroupEntity bloodGroupEntity) {
        this.bloodGroupEntity = bloodGroupEntity;
    }

    public DonorEntity() {
    }

    public DonorEntity(int donorId, String donorName, String donorGender, Date donorDob, Long donorMobileNo, String donorEmailId, String donorBloodGroup, String donorAddress, int donorBloodUnit, BloodGroupEntity bloodGroupEntity) {
        this.donorId = donorId;
        this.donorName = donorName;
        this.donorGender = donorGender;
        this.donorDob = donorDob;
        this.donorMobileNo = donorMobileNo;
        this.donorEmailId = donorEmailId;
        this.donorBloodGroup = donorBloodGroup;
        this.donorAddress = donorAddress;
        this.donorBloodUnit = donorBloodUnit;
        this.bloodGroupEntity = bloodGroupEntity;
    }

    @Override
    public String toString() {
        return "DonorEntity{" +
                "donorId=" + donorId +
                ", donorName='" + donorName + '\'' +
                ", donorGender='" + donorGender + '\'' +
                ", donorDob=" + donorDob +
                ", donorMobileNo=" + donorMobileNo +
                ", donorEmailId='" + donorEmailId + '\'' +
                ", donorBloodGroup='" + donorBloodGroup + '\'' +
                ", donorAddress='" + donorAddress + '\'' +
                ", donorBloodUnit=" + donorBloodUnit +
                ", bloodGroupEntity=" + bloodGroupEntity +
                '}';
    }
}
