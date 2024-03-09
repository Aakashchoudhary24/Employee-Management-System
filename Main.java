import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        MenuScreen screen = new MenuScreen();
        screen.menu();
    }
}

class MenuScreen {
    public void menu(){
        System.out.println("\t-----------------------------------------");
        System.out.println("\n\tWelcome to the Employee Management System");
        System.out.println("\n\t-----------------------------------------");
        System.out.println("\n\tBuilt by : KK Surendran  \n\t\t   Sai Sameer \n\t\t   MS Raghavan \n\t\t   Aakash Choudhary");
        System.out.println("\n\t-----------------------------------------");
        System.out.println("\n\tPlease enter the following keys as required");
        System.out.println("\n\tPress 1 : To View Employee Details");
        System.out.println("\n\tPress 2 : To Add An Employee");
        System.out.println("\n\tPress 3 : To Remove An Employee");
        System.out.println("\n\tPress 4 : To Update Employee Detail");
        System.out.println("\n\tPress 5 : To Sort/Filter Employees");
        System.out.println("\n\tPress 6 : To Access A Specific Department");
        System.out.println("\n\tPress 7 : To Print out Employee/Department Details");
    }
}

// THIS CLASS WILL BE USED IN THE ADD EMPLOYEE CLASS 
class EmployeeDetail {
    String name;
    String age;
    String email;
    String position;
    String salary;
    String identification;
    String contact;
    public void employeeInfo(){
        /* PUT THIS CODE IN A TRY BLOCK DUE TO A POTENTIAL RESOURCE LEAK, ERROR WAS THAT
         * SC WAS NEVER CLOSED 
         */
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the Employees Name-------------: ");
            name = sc.nextLine();
            System.out.println("Enter the Employees Age--------------: ");
            age = sc.nextLine();
            System.out.println("Enter the Employees Email Address----: ");
            email = sc.nextLine();
            System.out.println("Enter the Employees Position---------: ");
            position = sc.nextLine();
            System.out.println("Enter the Employees Salary-----------: ");
            salary = sc.nextLine();
            System.out.println("Enter the Employees Unique ID--------: ");
            identification = sc.nextLine();
            System.out.println("Enter the Employees Contact Info-----: ");
            contact = sc.nextLine(); 
        }
    }
}
