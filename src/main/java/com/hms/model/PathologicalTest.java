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
    protected String reagent;
    
    public PathologicalTest(String title, String testType, String reagent, double cost, boolean isAvailable) {
        this.title = title;
        this.testType = testType;
        this.reagent = reagent;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public PathologicalTest() {
        System.out.println("This is the default Constructor");
    }

    public String returnLabTestInfo() {
        String output = "Test name: " + this.getTitle() + " "
                + "Test Type: " + this.getTestType() + " "
                + "Reagent Name: " + this.getReagent()+" "
                + "Cost: " + this.getCost() + " "
                + "Availability: " + this.isIsAvailable();
        return output;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * @return the testType
     */
    public String getTestType() {
        return testType;
    }

    /**
     * @param testType the testType to set
     */
    public void setTestType(String testType) {
        this.testType = testType;
    }

    /**
     * @return the reagent
     */
    public String getReagent() {
        return reagent;
    }

    /**
     * @param reagent the reagent to set
     */
    public void setReagent(String reagent) {
        this.reagent = reagent;
    }
    
}
