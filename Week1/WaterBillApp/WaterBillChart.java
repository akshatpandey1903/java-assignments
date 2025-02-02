package WaterBillApp;

//package com.aurionpro;

import java.util.Scanner;

public class WaterBillChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no. of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        int charge = 0;

        if (unitsConsumed <= 100) {
            charge = unitsConsumed * 5;
        } else {
            if (unitsConsumed <= 250) {
                charge = unitsConsumed * 10;
            } else {
                charge = unitsConsumed * 20;
            }
        }

        int meterCharge = 75;

        int totalBill = meterCharge + charge;

        System.out.println("Total bill is meter charge : " + meterCharge + " + charge : " + charge + " = " + totalBill);

        scanner.close();
    }
}
