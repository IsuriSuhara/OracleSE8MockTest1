package test1;

import java.util.Arrays;

public class Q14 {
    int[][] matrix = new int[2][3];

    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};

    public int compute(int x, int y){
        return a[x]*b[y];//
    }

    public int[][] loadMatrix(){
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                matrix[x][y] = compute(x, y);//
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void main(String[] args) {
        Q14 t=new Q14();
        int[][] m=t.loadMatrix();

    }
}
