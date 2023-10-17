
public class RightRotate {

	public static void main(String[] args) {
		int arr[]={1,2,3,4};
		int temp;
		int n=2;
		for (int i = 0; i < n; i++) //3
		{
			temp=arr[arr.length-1];//temp=a[3]
			int j;
			for ( j = arr.length-1; j >0; j--) //3
			{
			 
				arr[j]=arr[j-1] ;//a[3]=a[2]//a[2]=a[1]//a[1]=a[0]
				
			}
			 arr[0]=temp;//a[0]=a[3]
			
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
