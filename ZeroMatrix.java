import java.util.*;
public class ZeroMatrix{
	 
	public static void makeZeros(int row, int col, int[][] matrix){
	
		//if rows and column length same then this should work otherwise
		//comment this line and  matrix[j][col]=0;
		//run another loop for columns
		for(int j=0;j<matrix[0].length;j++){
		          matrix[row][j]=0;
		          matrix[j][col]=0;	 
			
		}

//		 for(int j=0;j<matrix.length;j++){
  //                        matrix[j][col]=0;

//                }


	}

	public static void main(String... args){
	
		int[][] matrix=new int[][]{
			{0,3,4,0},
			{2,3,0,3},
			{1,3,4,5},
			{10,30,4,1}

		};

		boolean[][] matrixMarker=new boolean[matrix.length][matrix[0].length];

		for(int i=0;i<matrix.length;i++){
		
			for(int j=0; j<matrix[0].length;j++){
			
				if(matrix[i][j]==0 ){
				 matrixMarker[i][j]=true;
				}
				
			}
			
		}
	
	     for(int i=0;i<matrix.length;i++){

                        for(int j=0; j<matrix[0].length;j++){

                               if(matrixMarker[i][j]==true){
			       makeZeros(i,  j,  matrix);
			       }

                        }

                }


		  for(int i=0;i<matrix.length;i++){

                        for(int j=0; j<matrix[0].length;j++){

                            System.out.print(matrix[i][j]+" ");

                        }
			System.out.println();
                }

	}

}
