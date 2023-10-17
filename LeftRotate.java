
public class LeftRotate {

	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		int temp;
		int n=2;
		for (int i = 0; i < n; i++) //1
		{
			temp=arr[0];//temp=a[0]
			int j;
			for ( j =0; j < arr.length-1; j++) //
			{
			 
				arr[j]=arr[j+1];//a[0]=a[1]//a[1]=a[2]//
				
			}
			arr[j]=temp;
			
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
