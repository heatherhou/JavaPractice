import java.util.ArrayList;

   public class SandwichBar
   {
	  SandwichBar(){};
      public int whichOrder(String[] available, String[] orders){
    	  		
    	  		
      	  	//Create an arraylist of available materials without duplicates
    	  		ArrayList <String> have = new ArrayList <String>();
    	  		for (int j = 0; j< available.length; j++)
    	  		{
    	  			if (!have.contains(available[j]))
    	  					have.add(available[j]);
    	  		}

    	  		ArrayList <String> need = new ArrayList <String>();
    	  		
    	  		LOOP:
    	  		for (int i = 0; i < orders.length; i++)
    	  		{
    	  			int match = 0;
    	  			// get all wanted materials in order [i]
    	  			String s = orders[i];
    	  			String[] transfer = s.split(" ");
    	  			for (int j = 0; j< transfer.length;j++)
    	  			{
    	  				if (!need.contains(transfer[j]))
    	  					need.add(transfer[j]);
    	  			}
    	  		
    	  			
    	  			for (int m = 0; m < need.size();m++)
        	  		{
        	  			if (have.contains(need.get(m)))
        	  			{
        	  				match++;
        	  			}				
        	  		}
    	  			
        	  		if (match == need.size())
        	  		{	
        	  			return i;
        	  		}	
        	  		else 
        	  		{ 
        	  			need.clear();
        	  		}	
    	  		}	
    	  		return -1;	
    	  	}
  
  
    	  		
		    	  			
//      public static void main(String[] args) 
//		{
//			SandwichBar test = new SandwichBar();
//			String[] available = 
//				{ "cheese", "mustard", "lettuce" };
//			String[] orders = 
//				{ "cheese ham", "cheese mustard lettuce", "ketchup", "beer" };
//			int choice = test.whichOrder(available, orders);
//			System.out.println("Your choice is "+choice);
//		}
   }
   
   