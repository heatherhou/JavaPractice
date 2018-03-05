import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {
	public String[] dataCleanup(String[] names) {
        Person[] list = new Person[names.length];
        for (int i =0; i<list.length;i++)
        {
        		list[i] = new Person(names[i]);
        }
      
		Comparator<Person> comp = Comparator.comparing(Person::getLast);
	    comp = comp.thenComparing(Person::getFirst);
	    Arrays.sort(list,comp);
	    String[]result = new String[list.length];
	    for (int i=0; i<result.length;i++)
	    {
	    		result[i] = list[i].toString();
	    }
	    return result;
	}
}
 class Person{
	String first;
	String last;
	public Person(String s) {
		if (s.contains(","))
		{
			last = s.split(", ")[0];
			first = s.split(", ")[1];
		}
		else {
		first = s.split("\\s+")[0];
		last = s.split("\\s+")[1];
		}
	}
	public String getLast(){
		return last;
	}
	public String getFirst(){
		return first;
	}
	
	@Override 
	public String toString() {
		return first.concat(" ").concat(last);
	}
}
