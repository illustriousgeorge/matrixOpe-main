package cz.educanet.tranformations;

import kotlin.NotImplementedError;

import java.util.Arrays;

public class Matrix implements IMatrix {

    private final double[][] rawArray;

    public Matrix(double[][] rawArray) {
        this.rawArray = rawArray;
    }

    @Override
    public int getRows() {
        return rawArray.length;
    }

    @Override
    public int getColumns() {
        if (getRows() > 0)
            return rawArray[0].length;

        return 0;
    }

    @Override
    public IMatrix times(IMatrix matrix) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                z[i][j]=x[i][j]*y[i][j];
            }
    }

    @Override
    public IMatrix add(IMatrix matrix) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                z[i][j]=x[i][j]+y[i][j];
            }
        }
    }

    @Override
    public double get(int n, int m) {

        int collumns = 0
        int rows = 0

        int collumns1 = 1
        int rows1 = 1

        int n = [collumns][rows];
        int m = [collumns1][rows1];
    }

    //region Optional
    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public double determinant() {
        return 0;
    }
    //endregion
    //region Generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(rawArray, matrix.rawArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(rawArray);
    }
    //endregion
}
