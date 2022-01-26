package src.main.java.persistence.dao;

import java.util.List;

import src.main.java.model.*;

public interface GraphsDao {
    public Graphs createGraphs(List<Integer> weight, List<List<Integer>> edges, Graphs graphs);
    public Graphs insert(Graphs graphs, int weight, int[] adjacent);
    public Graphs update(Graphs graphs, int weight, int[] adjacent);
    public Graphs delete(Graphs graphs);
    public List<Boolean> bfs(Graphs graphs, int start);
    public List<Boolean> dfs(Graphs graphs, int start);
    public List<Boolean> dijskra(Graphs graphs, int start);
}
