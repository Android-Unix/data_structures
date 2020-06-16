package Problems;

public class StaircaseProblem{
	
	public double findWays(int n){
		if(n == 0 || n == 1)
			return 1;
		
		else
		{
			return findWays(n - 1) + findWays(n - 2);
		}
	}
	
}