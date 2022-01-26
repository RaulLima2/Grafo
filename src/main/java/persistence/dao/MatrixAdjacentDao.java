package src.main.java.persistence.dao;

import src.main.java.model.MatrixAdjacent;

public interface MatrixAdjacentDao {
    public MatrixAdjacent createMatrixAdjacent(int size);
    public void insert(int row, int column, int weight);
    public void delete(int row, int column);
    public void toString(MatrixAdjacent adjacent);
}
