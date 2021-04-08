package MatrixMult;

public class MatrixMult {

	public static void main(String[] args) {
		
		int [][] listx = {{2,1,3},{4,3,2}};
		int [][] listy = {{0,1,1},{3,2,1},{0,1,1}};
		
		print(mMultiplication(listx,listy));
		
	}
	
	
	public static int [][] mMultiplication(int [][] list1, int [][] list2) {
		
		int rows=list1.length;
		int columns=list2[0].length;
		
		int [][] nList= new int[rows][columns];
		int result=0;
		
		for(int i=0;i<rows;i++) {
			for (int j = 0; j < columns; j++) {				
				for (int k = 0; k < list2.length; k++) {
					result+=list1[i][k]*list2[k][j];
				}
				nList[i][j]=result;
				result=0;
			}
		}
		return nList;
	}
	
	public static void print(int [][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			 System.out.println();
		}
	}

}
