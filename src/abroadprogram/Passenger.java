/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abroadprogram;

import java.util.Scanner;


public class Passenger implements AbroadRules{
     private int fee;
    private boolean politicalBan;
    private boolean visaStatus;
    
    // Constructor to initialize the passenger's information
    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Amount of exit fee paid: ");
        this.fee = scanner.nextInt();
        
        scanner.nextLine();  // Consume the newline left by nextInt()
        
        System.out.println("Do you have any political bans? (yes or no) ");
        String answer = scanner.nextLine();
        
        if (answer.equalsIgnoreCase("yes")) {
            this.politicalBan = true;           
        } else {
            this.politicalBan = false;
        }

        System.out.println("Do you have a visa? (yes or no) ");
        String answer2 = scanner.nextLine();
         
        if (answer2.equalsIgnoreCase("yes")) {
            this.visaStatus = true;
        } else {
            this.visaStatus = false;
        }
    }

    // Method to check if the exit fee has been fully paid
    @Override
    public boolean checkExitFee() {
        if (this.fee < 15) {
            System.out.println("Please pay the full exit fee.");
            return false;
        } else {
            System.out.println("Exit fee process completed.");
            return true;
        }
    }

    // Method to check if there is any political ban
    @Override
    public boolean checkPoliticalBan() {
        if (this.politicalBan) {
            System.out.println("You cannot travel abroad.");
            return false;
        } else {
            System.out.println("You are allowed to travel abroad.");
            return true;
        }
    }

    // Method to check if the passenger has a valid visa
    @Override
    public boolean checkVisaStatus() {
        if (this.visaStatus) {
            System.out.println("Visa process completed.");
            return true;
        } else {
            System.out.println("You do not have a visa for the country you are traveling to...");
            return false;
        }
    }
}
