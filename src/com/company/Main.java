package com.company;
import com.company.data.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting POSist Task\n\n1. Create Record\n2. List Records\n3. Delete Record");
        Owner owner = new Owner();
        int ch = scanner.nextInt();
        switch(ch){
            case 1 : createRecord();
                     break;
            case 2 : deleteRecord();
                     break;
            default: System.out.println("You have entered wrong value");
        }
    }
    static void createRecord(){

    }

    static  void deleteRecord(){

    }

}
