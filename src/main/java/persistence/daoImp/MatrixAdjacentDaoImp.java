package src.main.java.persistence.daoImp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import src.main.java.model.Graphs;
import src.main.java.model.MatrixAdjacent;
import src.main.java.persistence.dao.MatrixAdjacentDao;

public class MatrixAdjacentDaoImp implements MatrixAdjacentDao {
    private static void startMA(Graphs graphs) {
        int i = 0;
        Integer[] a = new Integer[graphs.getV()];
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<LinkedList<Integer>> matrix = new LinkedList<LinkedList<Integer>>();
        MatrixAdjacent matrixAdjacent = new MatrixAdjacent(matrix);
        graphs.setMatrixAdjacent(matrixAdjacent);

        Arrays.fill(a, 0);
        Collections.addAll(list, a);

        for (i = 0; i < graphs.getV(); i++) {
            graphs.getMatrixAdjacent().getAdjacent().add(i,list);
        }
    }
    @Override
    public MatrixAdjacent createMatrixAdjacent(int size) {
        MatrixAdjacent matrixAdjacent = new MatrixAdjacent();
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(int row, int column, int weight) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int row, int column) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void toString(MatrixAdjacent adjacent) {
        // TODO Auto-generated method stub
        
    }
    
}
