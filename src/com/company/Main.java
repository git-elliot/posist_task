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
            case 1 : createRecord(owner);
                     break;
            case 2 : displayRecord(owner);
                     break;
            case 3 : deleteRecord(owner);
                     break;
            default: System.out.println("You have entered wrong value");
        }
    }
    static void createRecord(Owner owner){
        Scanner scanner = new Scanner(System.in);
         owner.createGenesisNode(scanner.next());
         System.out.println("A record has been created");
    }
    static void displayRecord(Owner owner){
        List<Node> records = owner.getRecordList();
        if(records == null){
            System.out.println("No records found. Please inserts first");
        }
        int len = records.size();
        for(int i=0;i<len;i++){
            System.out.println(records.get(i).getNodeId());
        }
    }
    static  void deleteRecord(Owner owner){
        owner.deleteRecordList();
        System.out.println("Records deleted successfully");
    }

}
