
public class SortByArylst implements Comparable<Sal> {

 
	  int sal ;
	  @Override
	public String toString() {
		return "SortByArylst [sal=" + sal + "]";
	}

	@Override
	public int compareTo(Sal sal) {
		return this.sal-sal.sal;
	}

}
