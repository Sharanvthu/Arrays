import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sal {
	  int sal;
	public Sal(int sal)
	{
		this.sal=sal;
	}

	public static void main(String[] args) {
		Sal s=new Sal(24000);
		Sal s1=new Sal(25000);
		Sal s2=new Sal(22000);
		Sal s3=new Sal(21000);
		ArrayList<Sal> al=new ArrayList<Sal>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("before sort");
		 for(Sal a:al){
			 System.out.println(a.sal);
		 }
		 System.out.println("After sort");
		 Collections.sort(al,new SortbyAL());
		 for(Sal a:al){
			 System.out.println(a.sal);
		 }
		}
		/* for(Sal s11:al
		 {
			 
			 if(s11.sal>23000)
			 {
			 System.out.println(s11.sal);
			 }
			 
		 }*/
	}

