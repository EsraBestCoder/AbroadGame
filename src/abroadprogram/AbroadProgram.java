/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abroadprogram;

import java.util.Scanner;



        /**
 * Main class for the Abroad Program.
 */
public class AbroadProgram {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Sabiha Gökçen Airport....");

        // Conditions that need to be met for traveling abroad
        String conditions = "Abroad Travel Rules...\n"
                            + "You must not have any political bans...\n"
                            + "You need to fully pay the exit fee of 15 TL...\n"
                            + "You must have a visa for the country you are traveling to...";
        String message = "You need to meet all the requirements for traveling abroad.";
        
        while (true) {
            System.out.println("*******************************************");
            System.out.println(conditions);
            System.out.println("*******************************************");
            
            // Create a new Passenger object
            Passenger passenger = new Passenger();
            
            System.out.println("Checking Exit Fee...");
            Thread.sleep(3000);  // Pause for 3 seconds
            
            if (!passenger.checkExitFee()) {
                System.out.println(message);
                continue;  // Restart the loop if the exit fee condition is not met
            }
            
            System.out.println("Checking Political Ban...");
            Thread.sleep(3000);  // Pause for 3 seconds
            
            if (!passenger.checkPoliticalBan()) {
                System.out.println(message);
                continue;  // Restart the loop if the political ban condition is not met
            }
            
            System.out.println("Checking Visa Status...");
            Thread.sleep(3000);  // Pause for 3 seconds
            
            if (!passenger.checkVisaStatus()) {
                System.out.println(message);
                continue;  // Restart the loop if the visa condition is not met
            }
            
            // All conditions are met, the passenger can travel abroad
            System.out.println("Your process is complete! You can travel abroad...");
            break;  // Exit the loop as all conditions are met
        }
    }
}