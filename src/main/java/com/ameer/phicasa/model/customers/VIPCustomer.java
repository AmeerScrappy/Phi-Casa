/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model.customers;

/**
 *
 * @author student
 */
public class VIPCustomer implements Customer{

    private String cusID;    
    private String cusName;
    private String cusSurname;
    private String cusPhoneNumber;   

    public String getCusID() {
        return cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusSurname() {
        return cusSurname;
    }

    public String getCusPhoneNumber() {
        return cusPhoneNumber;
    }
    
    private VIPCustomer(){
        
    }
    
    private VIPCustomer(Builder build){
        cusID = build.cusID;
        cusName = build.cusName;
        cusSurname = build.cusSurname;
        cusPhoneNumber = build.cusPhoneNumber;
    }
    
    public static class Builder{
        
        private String cusID;    
        private String cusName;
        private String cusSurname;
        private String cusPhoneNumber;   
        
        public Builder(String cusID){
            this.cusID = "VIP"+cusID;
        }
    
        public Builder empName(String name){
            cusName = name;
            return this;
        }
        
        public Builder empSurname(String surname){
            cusSurname = surname;
            return this;
        }
        
        public Builder empPhoneNum(String phoneNum){
            cusPhoneNumber = phoneNum;
            return this;
        }     
        
        public VIPCustomer build(){
            return new VIPCustomer(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.cusID != null ? this.cusID.hashCode() : 0);
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
        final VIPCustomer other = (VIPCustomer) obj;
        if ((this.cusID == null) ? (other.cusID != null) : !this.cusID.equals(other.cusID)) {
            return false;
        }
        return true;
    }
    
    
}
