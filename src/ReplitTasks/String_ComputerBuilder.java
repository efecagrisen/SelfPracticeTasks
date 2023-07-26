package ReplitTasks;

import java.util.Scanner;

public class String_ComputerBuilder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        double screenSizePrice = 0;

        System.out.println("Select CPU type:");
        String cpuType = scan.nextLine();
        double cpuPrice = 0;
        scan.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        double ramPrice = 0;

        System.out.println("Select storage type:");
        String storageType = scan.nextLine().toUpperCase();

        scan.nextLine();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        double storageTypePrice = 0;
        //double storageSizePrice = 0;

        scan.nextLine();
        System.out.println("Select screen resolution:");
        String screenResolution = scan.nextLine().toUpperCase();
        scan.nextLine();
        double screenResolutionPrice = 0;


        if(screenSize==13.3){
            screenSizePrice = 200;
        }else if(screenSize==15.0){
            screenSizePrice = 300;
        }else{
            screenSizePrice = 400;
        }


        if(cpuType=="i3"){
            cpuPrice = 150;
        }else if(cpuType=="i5"){
            cpuPrice = 250;
        }else {
            cpuPrice = 350;
        }

        ramPrice = (ramSize/4)*50;


        if(storageType=="HDD"){
            storageTypePrice = (storageSize/500)*50;
        }else{
            storageTypePrice = (storageSize/500)*100;
        }

        if(screenResolution=="FULLHD"){
            screenResolutionPrice = 100;
        }else{
            screenResolutionPrice = 200;
        }

        double totalPrice = screenSizePrice+cpuPrice+ramPrice+storageTypePrice+screenResolutionPrice;


        System.out.println("Final price is: $"+ totalPrice);
        System.out.println(screenSizePrice);
        System.out.println(cpuPrice);
        System.out.println(ramPrice);
        System.out.println(storageTypePrice);
        System.out.println(screenResolutionPrice);


    }
}