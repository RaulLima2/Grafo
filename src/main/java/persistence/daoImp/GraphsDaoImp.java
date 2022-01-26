package src.main.java.persistence.daoImp;

import java.util.LinkedList;
import java.util.List;

import src.main.java.model.Graphs;
import src.main.java.model.ListAdjacent;
import src.main.java.model.MatrixAdjacent;
import src.main.java.persistence.dao.GraphsDao;


//Clss GraphsDaoImp implements GraphsDao
public class GraphsDaoImp implements GraphsDao{
        
        //Method createGraphs
        public Graphs createGraphs(List<Integer> weight, List<List<Integer>> edges, Graphs graphs){{
            MatrixAdjacent ma;
            ListAdjacent la;
            LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
            LinkedList<LinkedList<Integer>> matrix = new LinkedList<LinkedList<Integer>>();

            try {                
                graphs = new Graphs(degree, matrixAdjacent, listAdjacent);
                return graphs;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            return graphs;
        }
        
        
        //Method insert
        public Graphs insert(Graphs graphs, int weight, int[] adjacent) {
            return graphs;
        }
        
        //Method update
        public Graphs update(Graphs graphs, int weight, int[] adjacent) {
            return graphs;
        }
        
        //Method delete
        public Graphs delete(Graphs graphs) {
            return graphs;
        }
        
        //Method bfs
        public List<Boolean> bfs(Graphs graphs, int start) {
            return null;
        }
        
        //Method dfs
        public List<Boolean> dfs(Graphs graphs, int start) {
            return null;
        }
        
        //Method dijskra
        public List<Boolean> dijskra(Graphs graphs, int start) {
            return null;
        }
}
