import java.util.Comparator;

public class SortbyAL implements Comparator<Sal> {
	 
 

	@Override
	public int compare(Sal o1, Sal o2) {
		
		return o1.sal-o2.sal;
	}
	
	

}
