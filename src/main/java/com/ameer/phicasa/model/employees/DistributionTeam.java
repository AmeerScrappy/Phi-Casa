/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model.employees;

/**
 *
 * @author student
 */
public final class DistributionTeam implements Employee{
    
    private String EmpID;
    private String EmpName;
    private String EmpSurname;
    private String EmpPhoneNumber;
    private String DeliveryAddress;

    private DistributionTeam(){
        
    }
    
    private DistributionTeam(Builder build){
        EmpID = build.EmpID;
        EmpName = build.EmpName;
        EmpSurname = build.EmpSurname;
        EmpPhoneNumber = build.EmpPhoneNumber;
        DeliveryAddress = build.DeliveryAddress;
    }
    
    public String getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpSurname() {
        return EmpSurname;
    }

    public String getEmpPhoneNumber() {
        return EmpPhoneNumber;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }
    
    public static class Builder{
        
        private String EmpID;
        private String EmpName;
        private String EmpSurname;
        private String EmpPhoneNumber;
        private String DeliveryAddress;
        
        public Builder(String EmpID){
            this.EmpID = "DIS"+EmpID;
        }
    
        public Builder empName(String name){
            EmpName = name;
            return this;
        }
        
        public Builder empSurname(String surname){
            EmpSurname = surname;
            return this;
        }
        
        public Builder empPhoneNum(String phoneNum){
            EmpPhoneNumber = phoneNum;
            return this;
        }     
        
        public Builder DeliveryAddress(String add){
            DeliveryAddress = add;
            return this;
        }
        
        public DistributionTeam build(){
            return new DistributionTeam(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.EmpID != null ? this.EmpID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DistributionTeam other = (DistributionTeam) obj;
        if ((this.EmpID == null) ? (other.EmpID != null) : !this.EmpID.equals(other.EmpID)) {
            return false;
        }
        return true;
    }
    
}
