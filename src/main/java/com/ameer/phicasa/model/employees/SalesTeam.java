/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model.employees;

import com.ameer.phicasa.model.customers.Customer;
import java.util.List;

/**
 *
 * @author student
 */
public final class SalesTeam implements Employee{

    private String EmpID;
    private String EmpName;
    private String EmpSurname;
    private String EmpPhoneNumber;
    private List<Customer> customerList;

    private SalesTeam(){
        
    }
    
    private SalesTeam(Builder build){
        EmpID = build.EmpID;
        EmpName = build.EmpName;
        EmpSurname = build.EmpSurname;
        EmpPhoneNumber = build.EmpPhoneNumber;
        customerList = build.customerList;
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
    
    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public static class Builder{
        
        private String EmpID;
        private String EmpName;
        private String EmpSurname;
        private String EmpPhoneNumber;
        private List<Customer> customerList;
        
        public Builder(String EmpID){
            this.EmpID = "SALE"+EmpID;
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
        
        public Builder getCustomerList(List<Customer> List){
            customerList = List;
            return this;
        }
        public SalesTeam build(){
            return new SalesTeam(this);
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
        final SalesTeam other = (SalesTeam) obj;
        if ((this.EmpID == null) ? (other.EmpID != null) : !this.EmpID.equals(other.EmpID)) {
            return false;
        }
        return true;
    }
    
    
}
