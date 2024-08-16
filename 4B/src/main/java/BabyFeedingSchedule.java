/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
public class BabyFeedingSchedule {
    public static void main(String[] args) {
        // 2 liters of porridge
        double porridge = 2.0; 
         // 2 liters of milk
        double milk = 2.0;
        // Half a liter cup
        double cupSize = 0.5; 
         // 45 minutes after porridge

        int porridgeFeedTime = 45;
        // 30 minutes after milk
        int milkFeedTime = 30; 

        int totalMinutes = 0;

        while (porridge > 0 || milk > 0) {
            if (porridge > 0) {
               // Half a cup of porridge  
                porridge -= cupSize / 2;
                totalMinutes += porridgeFeedTime;
            }
            if (milk > 0) {
                // Full cup of milk
                milk -= cupSize; 
                totalMinutes += milkFeedTime;
            }
        }

        System.out.println("Total time to finish both porridge and milk: " + totalMinutes + " minutes");
    }
}

    

