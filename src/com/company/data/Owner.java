package com.company.data;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class Owner {
    List<Node> recordList;
    String ownerId;
    String publicKey;
    String privateKey;

    public Owner(){}
    private long createTimeStamp(){

        Date date= new Date();
        long time = date.getTime();

        return time;
    }
    private String createUniqueId(){
      return null;
    }
    public Node createGenesisNode(String data){

        Node node = new Node(createTimeStamp(),data,0,createUniqueId(),null,null);
        return node;
    }


    private List<Node> createSetOfChilds(Node parentNode){
        List<Node> childNodes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String ch = "y";
        while(ch.equals("y")||ch.equals("Y")){
            System.out.println("Enter data : ");
            Node child = new Node(createTimeStamp(),scanner.next(),parentNode.getNodeNumber()+1,createUniqueId(),parentNode.toString(),null);
            childNodes.add(child);
            System.out.println("Do you want to add more childs ?");
            ch = scanner.next();
        }
        return childNodes;
    }
    private Node createChild(Node parentNode){
        System.out.println("Enter data : ");
        Scanner scanner = new Scanner(System.in);
        Node child = new Node(createTimeStamp(),scanner.next(),parentNode.getNodeNumber()+1,createUniqueId(),parentNode.toString(),null);
        return child;
    }

    private void encryptData(){

    }
    private void decryptData(){

    }
    private List<Node> findLongestChain(Node startNode){
       return null;
    }
    private  Node mergeNodes(Node first, Node second){
        return null;
    }
}
