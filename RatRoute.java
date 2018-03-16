
public class RatRoute {
	private char[][] myGrid;
	private int myRows, myCols;
	private int myCheeseRow, myCheeseCol;
	
	public int numRoutes(String[] enc) {
		myRows = enc.length;
		myCols = enc[0].length();
		myGrid = new char[myRows][myCols];
		int ratRow = 0,ratCol = 0;
		// initialize all, state & instance vars ,
		for (int i =0 ; i < enc.length;i++)
			for (int j =0; j< enc[0].length(); j++)
		{
			myGrid[i][j] = enc[i].charAt(j);
			if (myGrid[i][j]=='R')
			{
				ratRow = i;
				ratCol = j;
			}else if (myGrid[i][j] == 'C')
			{
				myCheeseRow = i;
				myCheeseCol = j;
			}	
		}
		int currentDistance = cheeseDistance(ratRow, ratCol);
		return routeCount(ratRow, ratCol, currentDistance+ 1);
	}
	
	private int cheeseDistance(int ratRow, int ratCol) {
		return (int) (Math.pow(ratRow - myCheeseRow, 2) + Math.pow(ratCol - myCheeseCol, 2));
		
	}
	
	private int routeCount(int ratRow, int ratCol, int currentDistance)
	{
		int up = 0, left =0, right =0, down = 0;
		if( cheeseDistance(ratRow,ratCol) > currentDistance)
			 return 0;
		
		if (myGrid[ratRow][ratCol] == 'X')
			return 0;
		
		if (myGrid[ratRow][ratCol] == 'C')
			return 1;
		
		if (ratRow != 0)
			up = routeCount(ratRow -1, ratCol, cheeseDistance(ratRow,ratCol));
		
		if (ratRow != myRows -1)
			down = routeCount(ratRow + 1, ratCol,cheeseDistance(ratRow,ratCol));
		
		if (ratCol != 0)
			left = routeCount(ratRow, ratCol -1, cheeseDistance(ratRow,ratCol));
		
		if (ratCol != myCols-1)
			right = routeCount (ratRow, ratCol + 1, cheeseDistance(ratRow,ratCol));	
		
		return left+ right + up +down;
	}
//	 public static void main(String[] args){
//	        String[] enc = {
//	        		".....X.XX", ".XXX..XX.", ".........", ".X..XX.X.", "CR...X.XX"
//	        };
//	        RatRoute rr = new RatRoute();
//	        System.out.println(rr.numRoutes(enc));
//	    }
}
