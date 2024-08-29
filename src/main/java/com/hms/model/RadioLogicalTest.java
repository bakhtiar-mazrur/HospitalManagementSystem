/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class RadioLogicalTest extends LabTest{
   
    private String plateDimension;
    
    public RadioLogicalTest(String title, String plateDimension, double cost, boolean isAvailable) {
        super(title, cost, isAvailable);
        this.plateDimension = plateDimension;
    }

    public String returnLabTestInfo() {
        String output = "Test name: " + this.title + " "
                + "Test Type: " + this.plateDimension+ " "
                + "Cost: " + this.cost + " "
                + "Availability: " + this.isAvailable;
        return output;
    }

    /**
     * @return the plateDimension
     */
//    public String getPlateDimension() {
//        return plateDimension;
//    }
//
//    /**
//     * @param plateDimension the plateDimension to set
//     */
//    public void setPlateDimension(String plateDimension) {
//        this.plateDimension = plateDimension;
//    }

}

