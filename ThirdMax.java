
public class ThirdMax 
{

	public static void main(String[] args) 
	{
		int arr[]={10,10,20,30,40,40};
		int arr1[]=new int[arr.length];


		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					 arr1[i]=arr[j];
					 System.out.println(arr1[i]);
				}
			}
			

		}
		

	}

}
