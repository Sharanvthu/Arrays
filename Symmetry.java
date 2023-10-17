
public class Symmetry {

	public static void main(String[] args) {
		int row=4;
		int[][] a ={{10,20},{20,10},{30,25},{25,30}};
		for (int i = 0; i <row ; i++) {
			for (int j = i+1; j < row; j++) {
				if((a[i][0]==a[j][1])&&(a[i][1]==a[j][0]))
						{
						System.out.print("(");
						System.out.print(a[i][0]);
						System.out.print(",");
						System.out.print(a[i][1]);
						System.out.print(")");
						}
			}
		}
	}

}
