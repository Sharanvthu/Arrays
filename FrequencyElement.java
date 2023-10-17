public class FrequencyElement 
{  

	public static void main(String[] args) 
	{
		int arr[]={1,5,9,3,5,9,2,1};
		int fr[]=new int[arr.length];
		int visited=-1;

		for (int i = 0; i < arr.length; i++) //1
		{
			int count=1;
			for (int j = i+1; j < arr.length; j++)//5 
			{
				if(arr[i]==arr[j])//1==1
				{
					count++;//2
					fr[j]=visited;//fr[8]=-1
				}
			}
			if(fr[i]!=visited)//fr[0]!=-1
				fr[i]=count;//fr[0]=2
			}
		System.out.println("======================================");
		System.out.println("Elements\t\tFrequency");
		System.out.println("======================================");
		for (int i = 0; i < fr.length; i++) {
			if(fr[i]!=visited)
				System.out.println(arr[i]+"\t\t\t"+fr[i]);
		}

	}
}