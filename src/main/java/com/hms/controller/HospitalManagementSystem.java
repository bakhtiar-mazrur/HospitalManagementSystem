/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;
import com.hms.model.*;
import com.hms.view.*;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class HospitalManagementSystem {

    public static void main(String[] args) {
        System.out.println("Showing the homepage");
        Home viewHome = new Home();
        viewHome.setVisible(true);
        PathologicalTest pTest = new PathologicalTest("Blood test", "RBC Count", "Lysis", 300, true);
        System.out.println(pTest.returnLabTestInfo());
        
        RadioLogicalTest rTest = new RadioLogicalTest("X-ray", "4X2", 400, true);
        System.out.println(rTest.returnLabTestInfo());
//        pTest.setCost(300);
//        System.out.println("The updated cost of CBC is "+ pTest.getCost());
//        System.out.println(pTest.returnLabTestInfo());
        
//        PathologyTest viewHome = new PathologyTest();
//        viewHome.setVisible(true);

    }
}