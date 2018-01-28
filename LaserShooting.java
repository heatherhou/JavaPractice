import java.io.*;
import java.util.Scanner;

public class LaserShooting {

	public double numberOfHits(int[] x, int[] y1, int[] y2) {
	
		double range = 0;
		for (int i = 0; i< x.length; i++)
      {
    	  		range += Math.abs(Math.atan2(y1[i], x[i]) - Math.atan2(y2[i], x[i]))/Math.PI;
      }
		return range;
 }
	
	

}
