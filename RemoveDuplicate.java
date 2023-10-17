
public class RemoveDuplicate {
	public static int toRemoveDuplicate(int[] a,int n) 
	{
		if (n==0||n==1) {
			return n;
			}
		int[] temp=new int[n];
		int j=0;
		for (int i = 0; i <n-1; i++) 
		{
			if(a[i]!=a[i+1])//10!=20
			{
				temp[j++]=a[i];//temp[]={10,20,30,40}
			}
		}
		temp[j++]=a[n-1];
		for (int i = 0; i < j; i++) {
			a[i]=temp[i];
		}
		return j;
	}
	

	public static void main(String[] args) {
		int[] a={10,20,20,30,40,40};
		int length=a.length;
		length=toRemoveDuplicate(a, length);
		for (int i = 0; i < length; i++) {
			System.out.println( a[i]);
		}
		

	}

}
