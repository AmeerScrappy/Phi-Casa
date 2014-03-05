/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model.employees;

import com.ameer.phicasa.model.garment.Garment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public final class FashionDesigner implements Employee{
    
    private String EmpID;
    private String EmpName;
    private String EmpSurname;
    private String EmpPhoneNumber;
    private List<Garment> garmentList;// = new ArrayList<Garment>();

    private FashionDesigner(){
        
    }
    
    private FashionDesigner(Builder build){
        EmpID = build.EmpID;
        EmpName = build.EmpName;
        EmpSurname = build.EmpSurname;
        EmpPhoneNumber = build.EmpPhoneNumber;
        garmentList = build.garmentList;
        
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

    public List<Garment> getGarment() {
        return garmentList;
    }
    
    
    public static class Builder{
        
        private String EmpID;
        private String EmpName;
        private String EmpSurname;
        private String EmpPhoneNumber;
        private List<Garment> garmentList;
        
        public Builder(String EmpID){
            this.EmpID = "FAD"+EmpID;
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
        public Builder garmentList(List<Garment> list){
            garmentList = list;
            return this;
        }
        
        public FashionDesigner build(){
            return new FashionDesigner(this);
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
        final FashionDesigner other = (FashionDesigner) obj;
        if ((this.EmpID == null) ? (other.EmpID != null) : !this.EmpID.equals(other.EmpID)) {
            return false;
        }
        return true;
    }
    
}
