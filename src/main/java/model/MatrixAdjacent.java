package src.main.java.model;

import java.util.LinkedList;

//Class MatrixAdjacent
public class MatrixAdjacent {
    private LinkedList<LinkedList<Integer>> adjacent;
    
    //Constructor
    public MatrixAdjacent(LinkedList<LinkedList<Integer>> adjacent) {
        this.adjacent = adjacent;
    }
    
    //Getters and Setters
    public LinkedList<LinkedList<Integer>> getAdjacent() {
        return this.adjacent;
    }
    public void setAdjacent(LinkedList<LinkedList<Integer>> Adjacent) {
        this.adjacent = Adjacent;
    }
}