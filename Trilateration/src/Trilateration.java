
public class Trilateration {
	
	// d1 , d2 , d3 are distances from a beacon to readers(say r1 , r2 , r3)
	// reader coordinates via geolocation() --> x1 , y1 ...
	
	public static void findposition(double x1 , double y1 , double d1 , double x2 , double y2 , double d2 , double x3 , double y3 , double d3)
	{
		double pointx  , pointy;
		
		double d1Square = d1 * d1 , d2Square = d2 * d2 , d3Square = d3 * d3;
		double x1Square = x1 * x1 , x2Square = x2 * x2 , x3Square = x3 * x3;
		double	y1Square = y1 * y1 , y2Square = y2 * y2 , y3Square = y3 * y3; 
		
		
		double A = (-2 * x1) + (2 * x2);
		double B = (-2 * y1) + (2 * y2);
		double C = (d1Square - d2Square - x1Square + x2Square - y1Square + y2Square);
		double D = (-2 * x2) + (2 * x3);
		double E = (-2 * y2) + (2 * y3);
		double F = (d2Square - d3Square - x2Square + x3Square - y2Square + y3Square);
		
		double nrx = (C * E) - (F * B);
		double drx = (E * A) - (B * D);
		
		pointx = nrx / drx;
		
		double nry = (C * D) - (A * F);
		double dry = (B * D) - (A * E);
		
		pointy = nry / dry; 
		
		System.out.println(pointx + " , " + pointy);
	}
	
	public static double calculateDistance(int rssi , int measuredpower , int N)
	{
		int res = measuredpower - rssi;
		
		System.out.println(res);
		
		int val = res / 10 * N;
		
		System.out.println(val);
		return Math.pow(10, val);
	}

}
