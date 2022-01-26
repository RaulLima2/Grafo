package src.main.java.model;

import java.util.LinkedList;

//Class ListAdjacent
public class ListAdjacent {
    private LinkedList<LinkedList<Integer>> adjacent;
    
    //Constructor
    public ListAdjacent(LinkedList<LinkedList<Integer>> linkedList) {
        this.adjacent = linkedList;
    }
    
    //Getters and Setters
    public LinkedList<LinkedList<Integer>> getAdjacent() {
        return this.adjacent;
    }
    public void setAdjacent(LinkedList<LinkedList<Integer>> Adjacent) {
        this.adjacent = Adjacent;
    }
}