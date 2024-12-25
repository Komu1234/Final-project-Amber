package com.example.redbank.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "bloodgroup_table")
public class BloodGroupEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bloodgroupId;

    private String bloodgroupType;

    @OneToMany(mappedBy = "bloodGroupEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<DonorEntity> donorList;

    @OneToMany(mappedBy = "bloodgroupEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<RecieverEntity> recieverList;

    public int getBloodgroupId() {
        return bloodgroupId;
    }

    public void setBloodgroupId(int bloodgroupId) {
        this.bloodgroupId = bloodgroupId;
    }

    public String getBloodgroupType() {
        return bloodgroupType;
    }

    public void setBloodgroupType(String bloodgroupType) {
        this.bloodgroupType = bloodgroupType;
    }

    public List<DonorEntity> getDonorList() {
        return donorList;
    }

    public void setDonorList(List<DonorEntity> donorList) {
        this.donorList = donorList;
    }

    public List<RecieverEntity> getRecieverList() {
        return recieverList;
    }

    public void setRecieverList(List<RecieverEntity> recieverList) {
        this.recieverList = recieverList;
    }

    public BloodGroupEntity(int bloodgroupId, String bloodgroupType, List<DonorEntity> donorList,
            List<RecieverEntity> recieverList) {
        this.bloodgroupId = bloodgroupId;
        this.bloodgroupType = bloodgroupType;
        this.donorList = donorList;
        this.recieverList = recieverList;
    }

    public BloodGroupEntity() {
    }

    @Override
    public String toString() {
        return "BloodGroupEntity [bloodgroupId=" + bloodgroupId + ", bloodgroupType=" + bloodgroupType + ", donorList="
                + donorList + ", recieverList=" + recieverList + "]";
    }

    
}
