/*/
 * Jonathan Wiley
 * Csc 201 
 * Broken BrokenGPS
 * 
 * Algorithm
 * 1. Calculate coordinates distance
 * 2. Generate random numbers
 * 3. Display results
 * 
 */
import java.util.Random;

public class BrokenGPS {
	private static int xCoord=0;
	private static int yCoord=0;
	
	public static void main( String[] args ){
		final int TURNS=12;
		
		System.out.println( "\t\t**Broken GPS**\nSpeed: 60 miles/hour \nDriver starting point: ( "+xCoord+", "+yCoord+" )" );
		
		for( int i=0; i<TURNS ;i++ ){
                     		int d;
		Random randGen = new Random();
		d = randGen.nextInt(4);						
                
		if( d==0){										
			// North

			yCoord+= 5;
		}
		else if( d==1 ){									
			// South

			yCoord-= 5;
		}
		else if( d==2 ){									
			// East
			xCoord-= 5;

		}
		else if( d==3){									
			// West
			xCoord+= 5;

		}
		}
		
		System.out.println( "Distance: "+calculateDistance() +" miles" );
	}
	

	
	
	public static double calculateDistance(){
		double distance=0;
															
		// formula for distance = sqrt( (x2-x1)^2 + (y2-y1)^2 ); as x1 and y1 are 0 they are not needed
		distance = Math.sqrt(Math.pow( xCoord, 2 )+ Math.pow( yCoord, 2 ));	
                
		return distance;
	}
}