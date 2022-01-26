package src.main.java.model;

import java.util.List;

//Class Graphs
public class Graphs {
    private int V;
    private int E;
    private List<Integer> weight;
    private List<Integer> degree;
    private MatrixAdjacent matrixAdjacent;
    private ListAdjacent listAdjacent;

    //Constructor
    public Graphs(List<Integer> degree, List<Integer> weight, MatrixAdjacent matrixAdjacent, ListAdjacent listAdjacent) {
        this.degree = degree;
        this.weight = weight;
        this.matrixAdjacent = matrixAdjacent;
        this.listAdjacent = listAdjacent;
    }

    //Getters and Setters
    public int getV() {
        return this.V;
    }

    public void setV(int v) {
        V = v;
    }

    public int getE() {
        return this.E;
    }

    public void setE(int e) {
        E = e;
    }

    public List<Integer> getWeight() {
        return this.weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public List<Integer> getDegree() {
        return this.degree;
    }

    public void setDegree(List<Integer> degree) {
        this.degree = degree;
    }

    public MatrixAdjacent getMatrixAdjacent() {
        return this.matrixAdjacent;
    }

    public void setMatrixAdjacent(MatrixAdjacent matrixAdjacent) {
        this.matrixAdjacent = matrixAdjacent;
    }

    public ListAdjacent getListAdjacent() {
        return this.listAdjacent;
    }

    public void setListAdjacent(ListAdjacent listAdjacent) {
        this.listAdjacent = listAdjacent;
    }
}