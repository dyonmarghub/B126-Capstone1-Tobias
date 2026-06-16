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
            case 3:
                displayGoExtraSubMenu();
                break;
            case 4:
                displayUnliSubMenu();
                break;
            case 5:
                displayAllNetSubMenu();
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
    
    
    // GO Extra SubMenu
    public static void displayGoExtraSubMenu() {

        System.out.println("\n*** Go Promos ***");
        System.out.println("{1} GoEXTRA59");
        System.out.println("{2} GoEXTRA99");
        System.out.println("{3} GoEXTRA109");
        System.out.println("{4} GoEXTRA199");
        System.out.println("{5} Back");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                subscribePromo(
                        "GoEXTRA59",
                        "Data for all sites + Unli Calls & Texts to all networks for only 59.",
                        "You are now subscribed to GoEXTRA59. Enjoy Data for all sites + Unli Calls & Texts to all networks. valid for 3days",
                        3
                );
                break;

            case 2:
                subscribePromo(
                        "GoEXTRA99",
                        "8GB all-access data + 4GB free 5G data + Unli Calls & Texts to all networks for only 99. valid for 7 days.",
                        "You are now subscribed to GoEXTRA99. Enjoy 8GB all-access data + 4GB free 5G data + Unli Calls & Texts to all networks valid for 7 days.",
                        3
                );
                break;

            case 3:
                subscribePromo(
                        "GoEXTRA109",
                        "10GB all-access data + Unli Calls & Texts to all networks for only 109.",
                        "You are now subscribed to Go30. Enjoy 10GB all-access data + Unli Calls & Texts to all networks Valid for 7days.",
                        3
                );
                break;
                
            case 4:
                subscribePromo(
                        "GoEXTRA199",
                        "8GB all-access data + free 5G data + Unli Calls & Texts to all networks for only 199.",
                        "You are now subscribed to GoEXTRA199. Enjoy 8GB all-access data + free 5G data + Unli Calls & Texts to all networks Valid for 15days.",
                        3
                );
                break;

            case 5:
                displayMainMenu();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    
    // Unli SubMenu
    public static void displayUnliSubMenu() {

        System.out.println("\n*** Go Promos ***");
        System.out.println("{1} Unli5G59");
        System.out.println("{2} Unli5G80");
        System.out.println("{3} UnliGo99 FB");
        System.out.println("{4} UnliGo99 TikTok");
        System.out.println("{5} UnliGo99 Instagram");
        System.out.println("{6} Back");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                subscribePromo(
                        "Unli5G59",
                        "Unlimited 5G data + 2GB all-sites data for only 59.",
                        "You are now subscribed to Unli5G59. Enjoy Unlimited 5G data + 2GB all-sites data valid for 2days",
                        4
                );
                break;

            case 2:
                subscribePromo(
                        "Unli5G80",
                        "Unlimited 5G data + 2GB all-sites data + unlimited calls & texts to all networks for only 80.",
                        "You are now subscribed to Unli5G80. Enjoy Unlimited 5G data + 2GB all-sites data + unlimited calls & texts to all networks valid for 2 days.",
                        4
                );
                break;

            case 3:
                subscribePromo(
                        "UnliGo99 FB",
                        "8GB all-sites data + Unlimited Facebook-access data + Unli Calls & Texts to all networks for only 99.",
                        "You are now subscribed to UnliGo99 FB. Enjoy 8GB all-sites data + Unlimited Facebook Valid for 7days.",
                        4
                );
                break;

            case 4:
                subscribePromo(
                        "UnliGo99 TikTok",
                        "8GB all-sites data + Unlimited TikTok for only 99.",
                        "You are now subscribed to UnliGo99 TikTok. Enjoy 8GB all-sites data + Unlimited TikTok Valid for 7days.",
                        4
                );
                break;
                
            case 5:
                subscribePromo(
                        "UnliGo99 Instagram",
                        "8GB all-sites data + Unlimited Instagram for only 99.",
                        "You are now subscribed to UnliGo99 Instagram. Enjoy 8GB all-sites data + Unlimited Instagram Valid for 7days.",
                        4
                );
                break;    

            case 6:
                displayMainMenu();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    
    
    // GO Extra SubMenu
    public static void displayAllNetSubMenu() {

        System.out.println("\n*** Go Promos ***");
        System.out.println("{1} GoUNLI20");
        System.out.println("{2} GoUNLI30");
        System.out.println("{3} GoUNLI50");
        System.out.println("{4} GoUNLI95");
        System.out.println("{5} GoUNLI180");
        System.out.println("{6} GoUNLI350");
        System.out.println("{7} Back");

        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                subscribePromo(
                        "GoUNLI20",
                        "Unli calls & texts to all networks + data for only 20.",
                        "You are now subscribed to GoUNLI20. Enjoy Unli calls & texts to all networks + data valid for 1day",
                        5
                );
                break;

            case 2:
                subscribePromo(
                        "GoUNLI30",
                        "Unli calls & texts to all networks + data for only 30. valid for 7 days.",
                        "You are now subscribed to GoUNLI30. Enjoy Unli calls & texts to all networks + data valid for 2 days.",
                        5
                );
                break;

            case 3:
                subscribePromo(
                        "GoUNLI50",
                        "Unli calls & texts to all networks + data for only 50.",
                        "You are now subscribed to GoUNLI50. Enjoy Unli calls & texts to all networks + data Valid for 3days.",
                        5
                );
                break;
                
            case 4:
                subscribePromo(
                        "GoUNLI95",
                        "Unli calls & texts to all networks + 1GB data for only 95.",
                        "You are now subscribed to GoUNLI95. Enjoy Unli calls & texts to all networks + 1GB data Valid for 7days.",
                        5
                );
                break;
                
            case 5:
                subscribePromo(
                        "GoUNLI180",
                        "Unli calls & texts to all networks + 2GB data for only 180.",
                        "You are now subscribed to GoUNLI180. Enjoy Unli calls & texts to all networks + 2GB data for 7days.",
                        5
                );
                break; 
                
            case 6:
                subscribePromo(
                        "GoUNLI350",
                        "Unli calls & texts to all networks + 3GB data for only 350.",
                        "You are now subscribed to GoUNLI350. Enjoy Unli calls & texts to all networks + 3GB data Valid for 7days.",
                        5
                );
                break;

            case 7:
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
        switch (menuType) {
            case 1:
                displayGoPlusSubMenu();
                break;
            case 2:
                displayGoSubMenu();
                break;
            case 3:
                displayGoExtraSubMenu();
                break;
            case 4:
                displayUnliSubMenu();
                break;
            case 5:
                displayAllNetSubMenu();
                break;    

            case 6:
                System.out.println("Thank you for using Globe Services.");
                break;

            default:
                System.out.println("Invalid choice");
        }  }

    }
}