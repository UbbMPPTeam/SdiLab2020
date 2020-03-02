package userInterface;


import Controller.Controller;

import java.util.Scanner;
//import repo.*;
//import ctrl.*;

public class UI {

    private Controller controller;
    public UI(Controller controller){
        this.controller=controller;
    }

    public static void printMenu()
    {
        System.out.println("press 1 to add student");
        System.out.println("press 2 to print all students");
        System.out.println("press 0 to exit");
    }

    public void run()
    {
        Scanner scan=new Scanner(System.in);
        int input=0;
        while(true)
        {
            printMenu();
            input= scan.nextInt();
            switch (input) {
                case 1:{

                }
                case 2:{
                    System.out.println(controller.PrintStudents());
                }
                case 0:return;
            }
        }
    }

}
