package oop;
public class Matrix {
    private final int r;
    private final int c;
    private double[][] m;
    Matrix(int rows, int columns){
        r = rows;
        c = columns;
        m = new double[r][c];
    }
    public int getRows() { return this.r; }
    public int getColumns() { return this.c; }
    public double at(int i, int j) {
        if (i > r || j > c) {
            System.out.println("Error, index out of bounds");
            return 0;
        }
        return this.m[i][j];
    }
    public void setValue(int i, int j, double value){
        if (i > r || j > c) {
            System.out.println("Error, index out of bounds");
            return;
        }
        m[i][j] = value;
    }
    public Matrix add(Matrix mx){
        if (this.r != mx.getRows() || this.c != mx.getColumns()){
            System.out.println("Error add");
            return null;
        }
        Matrix res = new Matrix(this.r, this.c);
        for (int i = 0; i < this.r; ++i)
            for (int j = 0; j < this.c; ++j)
                res.setValue(i, j, this.m[i][j] + mx.at(i, j));
        return res;
    }
    public void mul(double num){
        for (int i = 0; i < this.r; ++i)
            for (int j = 0; j < this.c; ++j)
                this.m[i][j] *= num;
    }
    public Matrix mul(Matrix mx){
        if (this.c != mx.getRows()){
            System.out.println("Error mul");
            return null;
        }
        Matrix res = new Matrix(this.r, mx.getColumns());
        for (int i = 0; i < this.r; ++i){
            for (int j = 0; j < mx.getColumns(); ++j){
                double val = 0;
                for (int k = 0; k < this.r; ++k)
                    val += this.m[i][k] * mx.at(k, j);
                res.setValue(i, j, val);
            }
        }
        return res;
    }
    public void print(){
        for (int i = 0; i < this.r; ++i) {
            for (int j = 0; j < this.c; ++j)
                System.out.printf("%.2f\t",this.m[i][j]);
            System.out.println();
        }
    }
}
