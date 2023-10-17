
public class SecondSmallest {
	public static int getSecondSmallest(int[] a,int total) {
		int temp;
		for (int i = 0; i <  total; i++) 
		{
			for (int j = 0; j < total; j++) {
				if (a[i]<a[j]) {
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				
			}
			
		}
		return a[1];
		
	}

	public static void main(String[] args) {
		int a[]={9,1,3,7,8,2,4,6,5};
		System.out.println("Second smallest no is: "+getSecondSmallest(a, 9));
	

	}

}
