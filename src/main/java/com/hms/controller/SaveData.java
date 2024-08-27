/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.*;
import com.hms.view.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class SaveData {

    public SaveData(String returnLabTestInfo) {
        try {
            FileWriter resultSaver = new FileWriter("results.txt", true);
            
            resultSaver.write(returnLabTestInfo);
            resultSaver.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

//    public void write(String returnLabTestInfo) {;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}
