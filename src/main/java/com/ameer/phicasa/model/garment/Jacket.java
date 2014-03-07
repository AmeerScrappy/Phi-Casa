/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.phicasa.model.garment;

/**
 *
 * @author student
 */
public final class Jacket implements Garment{
    
    String GarmentID;
    String GarmentName;
    String GarmentSize;
    String GarmentColor;
    String GarmentFabric;
    
    private Jacket(){
        
    }
    
    private Jacket(Builder build){
        GarmentID = build.GarmentID;
        GarmentName = build.GarmentName;
        GarmentSize = build.GarmentSize;
        GarmentColor = build.GarmentColor;
        GarmentFabric = build.GarmentFabric;
    }

    public String getGarmentID() {
        return GarmentID;
    }

    public String getGarmentName() {
        return GarmentName;
    }

    public String getGarmentSize() {
        return GarmentSize;
    }

    public String getGarmentColor() {
        return GarmentColor;
    }

    public String getGarmentFabric() {
        return GarmentFabric;
    }
    
    public static class Builder{
        
        String GarmentID;
        String GarmentName;
        String GarmentSize;
        String GarmentColor;
        String GarmentFabric;
        
        public Builder(String GarmentID){
            this.GarmentID = "JACK"+GarmentID;
        }
        
        public Builder garmentID(String name){
            GarmentName = name;
            return this;
        }
        
        public Builder garmentSize(String size){
            GarmentSize = size;
            return this;
        }
        
        public Builder garmentColor(String color){
            GarmentColor = color;
            return this;
        }    
        
        public Builder garmentFabric(String fab){
            GarmentFabric = fab;
            return this;
        }
        
        public Jacket build(){
            return new Jacket(this);
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.GarmentID != null ? this.GarmentID.hashCode() : 0);
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
        final Jacket other = (Jacket) obj;
        if ((this.GarmentID == null) ? (other.GarmentID != null) : !this.GarmentID.equals(other.GarmentID)) {
            return false;
        }
        return true;
    }
    
}
