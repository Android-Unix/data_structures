package Problems;

public class ArrayBasedStack {
	
	private static int count = 0;
	private static int sizeOfArray = 10;
	private int[] stack = new int[sizeOfArray];
	
	public void printStack()
	{
		int i;
		for(i = count - 1; i >= 0 ; i--)
			System.out.println(stack[i]);
	}
	
	public int pop()
	{
		int data = (stack[count - 1]);
		count--;
		
		int[] stack2 = new int[sizeOfArray];
		int i;
		
		for(i = 0; i <= count; i++)
		{
			stack2[i] = stack[i];
		}
		
		stack = stack2;
		return data;
		
	}
	
	public void push(int data)
	{
		if(count < sizeOfArray)
		{
			stack[count] = data;
			count++;
		}	
		
		else
		{
			sizeOfArray *= 2;
			int[] stack2 = new int[sizeOfArray];
			int i;
			for(i = 0; i < stack.length; i++)
			{
				stack2[i] = stack[i];
			}
			
			stack2[count] = data;
			count++;
			
			stack = stack2;
		}
	}
	
	

}
