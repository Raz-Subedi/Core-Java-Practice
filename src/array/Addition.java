package array;

public class Addition {
    public static void main(String[] args) {

        int mat1[][] = {{22,44,55},{8,9,7},{77,11,33}};
        int mat2[][] = {{4,7,8},{44,55,66},{6,7,8}};
        int mat3[][] = new int[3][3];

//        addition
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
