/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

public class LoadRegistrationApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        if (isValidUSSD()) {
            displayMainMenu();
        } else {
            System.out.println("Invalid USSD Code");
        }

        sc.close();
    }

    
    
    // Validates USSD code
    public static boolean isValidUSSD() {
        System.out.println("Dial *143# to access Globe services");
        System.out.print("Enter USSD Code: ");
        String ussd = sc.nextLine();

        return ussd.equals("*143#");
    }

    
    
    // Displays Main menu
    public static void displayMainMenu() {

        System.out.println("\n\n ***************Load Registration ***************");
        System.out.println("{1} Go+");
        System.out.println("{2} Go");
        System.out.println("{3} Go EXTRA");
        System.out.println("{4} UNLI 5G");
        System.out.println("{5} ALLNET");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayGoPlusSubMenu();
                break;
            case 2:
                displayGoSubMenu();
                break;
            default:
                System.out.println("Option unavailable");
        }
    }

    
    
    // Display GO+ SubMenu
    public static void displayGoPlusSubMenu() {

        System.out.println("\n*** Go+ Promos ***");
        System.out.println("{1} Go+99");
        System.out.println("{2} Go+129");
        System.out.println("{3} Go+149");
        System.out.println("{4} Back");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                subscribePromo(
                        "Go+99",
                        "Get 8GB for all sites + 8GB",
                        "You are now subscribed to Go+99. Enjoy 8GB for all sites + 8GB valid for 7 days.",
                        1
                );
                break;

            case 2:
                subscribePromo(
                        "Go+129",
                        "Get 12GB for all sites + 8GB",
                        "You are now subscribed to Go+129. Enjoy 12GB for all sites + 8GB valid for 7 days.",
                        1
                );
                break;

            case 3:
                subscribePromo(
                        "Go+149",
                        "Get 16GB for all sites + 8GB",
                        "You are now subscribed to Go+149. Enjoy 16GB for all sites + 8GB valid for 7 days.",
                        1
                );
                break;
            case 4:
                displayMainMenu(
                );
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    
    
    // GO SubMenu
    public static void displayGoSubMenu() {

        System.out.println("\n*** Go Promos ***");
        System.out.println("{1} Go10");
        System.out.println("{2} Go20");
        System.out.println("{3} Go30");
        System.out.println("{4} Back");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                subscribePromo(
                        "Go10",
                        "1GB Data for 1 day",
                        "You are now subscribed to Go10. Enjoy 1GB Data valid for 1 day.",
                        2
                );
                break;

            case 2:
                subscribePromo(
                        "Go20",
                        "2GB Data for 2 days",
                        "You are now subscribed to Go20. Enjoy 2GB Data valid for 2 days.",
                        2
                );
                break;

            case 3:
                subscribePromo(
                        "Go30",
                        "3GB Data for 3 days",
                        "You are now subscribed to Go30. Enjoy 3GB Data valid for 3 days.",
                        2
                );
                break;
                
            case 4:
                displayMainMenu();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    
    
    // Generic promo subscription method
public static void subscribePromo(String promoName,
            String description,
            String successMessage,
            int menuType) {

        System.out.println("\n*** " + promoName + " Promo ***");
        System.out.println(description);
        System.out.println("{1} Subscribe");
        System.out.println("{2} Back");
        System.out.println("{3} Exit");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(successMessage);
                break;

            case 2:
                if (menuType == 1) {
                    displayGoPlusSubMenu();
                } else if (menuType == 2) {
                    displayGoSubMenu();
                }
                break;

            case 3:
                System.out.println("Thank you for using Globe Services.");
                break;

            default:
                System.out.println("Invalid choice");
        }  }
    }
