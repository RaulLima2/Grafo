package src.main.java.persistence.dao;

import java.util.LinkedList;

import src.main.java.model.Graphs;

public interface ListAdjacentDao {
    public void createListAdjacent(Graphs graphs, LinkedList<LinkedList<Integer>> edges);
    public void insert(int vertex, LinkedList<LinkedList<Integer>> edges, Graphs graphs);
    public void remove(Graphs graphs, int index, int vertex);
    public void update(Graphs graphs, int index, int vertex);
    public String toString(Graphs graphs);
}
