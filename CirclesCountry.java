
public class CirclesCountry {
	public boolean isInside(int x, int y, int cx, int cy, int r){
		// variable dist not shown
		double dist = Math.pow((double)(cx-x),2) + Math.pow((double)(cy-y),2);
		return dist < r*r;
	}

	public int leastBorders(int[] x, int[] y, int[] r, 
	                            int x1, int y1, int x2, int y2) {
		// you write code here
		int crosses = 0;
		for(int k=0; k < x.length; k++){
			if (isInside(x1,y1,x[k],y[k],r[k]) 
                    != isInside(x2,y2,x[k],y[k],r[k])) {
			    crosses += 1;
			}
		}
		return crosses;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
