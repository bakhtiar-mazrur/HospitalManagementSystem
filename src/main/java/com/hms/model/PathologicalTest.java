/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;
import com.hms.view.*;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class PathologicalTest extends LabTest {

    private String testType;
    private String reagent;
    
    public PathologicalTest(String title, String testType, String reagent, double cost, boolean isAvailable) {
        super(title, cost, isAvailable);
        this.testType = testType;
        this.reagent = reagent;
    }

//public PathologicalTest(){
//}

    public String returnLabTestInfo() {
        String output = "Test name: " + this.title + " "
                + "Test Type: " + this.testType + " "
                + "Reagent Name: " + this.reagent+" "
                + "Cost: " + this.cost + " "
                + "Availability: " + this.isAvailable;
        return output;
    }

//    /**
//     * @return the testType
//     */
//    public String getTestType() {
//        return testType;
//    }
//
//    /**
//     * @param testType the testType to set
//     */
//    public void setTestType(String testType) {
//        this.testType = testType;
//    }
//
//    /**
//     * @return the reagent
//     */
//    public String getReagent() {
//        return reagent;
//    }
//
//    /**
//     * @param reagent the reagent to set
//     */
//    public void setReagent(String reagent) {
//        this.reagent = reagent;
//    }

}
