
public class CopyElements {

	public static void main(String[] args) {
		int arr[]={1,5,9,7,5,3};
		int arr1[]= new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[j]=arr[i];
				
			}
			System.out.print(arr1[i]+" ");
		}
		
		
		
		 

	}

}
