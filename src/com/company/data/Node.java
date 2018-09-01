package com.company.data;

import java.util.List;

public class Node {

    private long timeStamp;
    private String data;
    private int nodeNumber;
    private String nodeId;
    private String referenceNodeId;
    private List<String> childReferenceNodeId;
    private String genesisReferenceNodeId;
    private String hashValue;

    public String getData() {
        return data;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getReferenceNodeId() {
        return referenceNodeId;
    }

    public List<String> getChildReferenceNodeId() {
        return childReferenceNodeId;
    }

    public String getGenesisReferenceNodeId() {
        return genesisReferenceNodeId;
    }

    public String getHashValue() {
        return hashValue;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public Node(){};
    public Node(long timeStamp,
         String data,
         int nodeNumber,
         String nodeId,
         String referenceNodeId,
         String hashValue){

        this.timeStamp = timeStamp;
        this.data = data;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.referenceNodeId = referenceNodeId;
        this.hashValue = hashValue;

    }
    private void setGenesisNodeId(String id){
        this.genesisReferenceNodeId = id;
    }
}
