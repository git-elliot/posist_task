package com.company;
import com.company.data.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Owner owner = new Owner();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ch = "n";
        while(ch.equals("n")||ch.equals("N")){

            System.out.println("Starting POSist Task\n\n1. Create Record\n2. Display Records\n3. Delete Record\n\nEnter your choice: ");
            int ch1 = scanner.nextInt();
            switch(ch1){
                case 1 : createRecord();
                    break;
                case 2 : displayRecord();
                    break;
                case 3 : deleteRecord();
                    break;
                default: System.out.println("You have entered wrong value");
            }
            System.out.println("Do you want to finish (Y/N) ?");
            ch = scanner.next();
        }
    }
    static void createRecord(){
        Scanner scanner = new Scanner(System.in);
         owner.createGenesisNode(scanner.next());
         System.out.println("A record has been created");
    }
    static void displayRecord(){
        List<Node> records = owner.getRecordList();
        if(records.size()==0){
            System.out.println("No records found. Please inserts first");
        }
        int len = records.size();
        for(int i=0;i<len;i++){
            System.out.println(records.get(i).getTimeStamp());
        }
    }
    static  void deleteRecord(){
        owner.deleteRecordList();
        System.out.println("Records deleted successfully");
    }

}
