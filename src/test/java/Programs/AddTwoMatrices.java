package Programs;

public class AddTwoMatrices {

	public static void main(String[] args) {

		int[][] matrices1 = {{1,2},{3,5},{7,8}};
		int[][] matrices2 = {{3,4},{8,9},{5,3}};
        System.out.println(matrices1.length);
        System.out.println(matrices1[0].length);
        int row =matrices1.length;
        int col=matrices1[0].length;
        int[][] sum = new int[matrices1.length][matrices1[0].length];
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		sum[i][j]=matrices1[i][j] +matrices2[i][j];
        	}
        }
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		System.out.print(sum[i][j]+ " ");
        	}
        	System.out.println();
        }
	}

}
