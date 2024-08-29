/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abroadprogram;

/**
 *
 * @author macbookair
 */
public interface AbroadRules {
    boolean checkExitFee();         // Method to check if the exit fee has been paid
    boolean checkPoliticalBan();    // Method to check for any political bans
    boolean checkVisaStatus();      // Method to check if the passenger has a valid visa
} 

