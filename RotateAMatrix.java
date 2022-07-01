class HelloWorld {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int shifted = 0;
        
        for(int i =0; i<matrix.length;i++){
            for(int j=0+shifted;j<matrix[0].length;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            shifted++;
        }
          for(int i =0; i<matrix.length;i++){
              System.out.print("[");
            for(int j=0;j<matrix[0].length;j++){
                 System.out.print(matrix[i][j]); 
                System.out.print(j < matrix[0].length-1 ? ",":""); 
            }
             System.out.print("]\n");
            
        }
        
    }
}
