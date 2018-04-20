import java.util.Arrays;
import java.util.Comparator;

public class URLSort {
     public String[] sort(String[] urls) {
          // you write this function
    	 	Arrays.sort(urls, new SortURL());
        return urls;
     }
     public static void main(String[] args) {
 		String[] urls = {"http://duke.edu", "https://arts.duke.edu", "https://coursework.cs.duke.edu", "https://dhvi.duke.edu", "https://dibs.duke.edu", 
 				"https://financialaid.duke.edu", "http://www.unc.edu", "https://www.google.com", "http://www.google.com" };
 		URLSort t = new URLSort();
 		t.sort(urls);
 }
 }

class SortURL implements Comparator<String>
{
  	  public int compare(String a, String b)
  	  {
  		  String[] as = a.split("://");
  		  String[] bs = b.split("://");
  		  String[] a2 = as[1].split("\\.");
  		  String[] b2 = bs[1].split("\\.");
  		  
  		  if (a2[a2.length-1].equals("edu") && !b2[b2.length -1].equals("edu") )
  			  return -1;
  		  else if (!a2[a2.length-1].equals("edu") && b2[b2.length -1].equals("edu") )
  			  return 1;
  		  
  		  int cmp = a2[a2.length-1].compareTo(b2[b2.length -1]);
  		  
  		  if (cmp ==0)
  		  {
  			  int cmp2 =  a2[a2.length-2].compareTo(b2[b2.length -2]);
  			  if (cmp2 == 0)
  			  {
 
				  if (a2.length ==2 && b2.length ==2);
				  else if (a2.length !=2 && b2.length !=2)
				  {
					  int min = Math.min(a2.length, b2.length);
					  for (int i = 3; i<= min; i++)
					  {
						  int cmpnext = a2[a2.length -i].compareTo(b2[b2.length -i]);
						  if (cmpnext != 0)
							  return cmpnext;
					  }
				  }else 
					  return (a2.length - b2.length);
  						  
  			 }else
  			   return cmp2;
  				  
  			  if (as[0].equals("https"))
  				  return -1;
  			  if (bs[0].equals("https"))
  				  return 1;
  			  return (as[0].compareTo(bs[0]));
  		  }
  		  else return cmp;
  	  }
}
  
  