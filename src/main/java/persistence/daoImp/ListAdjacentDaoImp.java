package src.main.java.persistence.daoImp;

import java.util.LinkedList;

import src.main.java.model.Graphs;
import src.main.java.model.ListAdjacent;
import src.main.java.persistence.dao.ListAdjacentDao;

public class ListAdjacentDaoImp implements ListAdjacentDao {

    private static void startLA(LinkedList<LinkedList<Integer>> edges, Graphs graphs) {
        int i = 0;
        LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
        ListAdjacent listAdjacent = new ListAdjacent(list);
        graphs.setListAdjacent(listAdjacent);

        for (i = 0; i < graphs.getV(); i++) {
            LinkedList<Integer> add = new LinkedList<>();
            graphs.getListAdjacent().getAdjacent().add(edges.get(i).get(0), add);
        }
    }

    @Override
    public void createListAdjacent(Graphs graphs, LinkedList<LinkedList<Integer>> edges) {
        int i = 0;
        
        startLA(edges, graphs);

        for(i = 0; i < graphs.getV(); i++) {
            this.insert(i, edges, graphs);
        }
    }

    @Override
    public void insert(int vertex, LinkedList<LinkedList<Integer>> edges, Graphs graphs) {
        try {
            graphs.getListAdjacent()
                    .getAdjacent()
                    .get(edges.get(vertex).get(0))
                    .add(edges.get(vertex).get(1));

            graphs.getListAdjacent()
                    .getAdjacent()
                    .get(edges.get(vertex).get(1))
                    .add(edges.get(vertex).get(0));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("Inserted");
        }
        
    }

    @Override
    public void remove(Graphs graphs, int index, int vertex) {
        try {
            graphs.getListAdjacent()
                    .getAdjacent()
                    .get(index)
                    .remove(vertex);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("Removed");
        }
    }

    @Override
    public void update(Graphs graphs, int index, int weight) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString(Graphs graphs) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        try {
            for (i = 0; i < graphs.getV(); i++) {
                sb.append(i + ": ");
                sb.append(graphs.getListAdjacent().getAdjacent().get(i));
                sb.append("\n");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("Printed");
        }

        return sb.toString();
    }
}
