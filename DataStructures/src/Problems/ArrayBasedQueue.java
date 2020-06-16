package Problems;

public class ArrayBasedQueue {
			
		private static int count = 0;
		private static int sizeOfArray = 10;
		private int[] queue = new int[sizeOfArray];
		
		private static int freeSpace = 0;
		private static int front = 0;
		private static int start = 0;
		
		public void printQueue()
		{
			int i;
			for(i = front ; i < count - freeSpace ;i++)
				System.out.println(queue[i]);
			
			if(freeSpace != 0)
			{
				for(i = 0; i < start; i++)
					System.out.println(queue[i]);
			}
		}
		
		public int deQueue()
		{	
			int data = 0 ;
			
			if(front != count)
			{
				data = (queue[front]);
				
				System.out.println("DeQueue From front position");
				queue[front] = 0;
				front += 1;
				
				/*
				Using another array every time deQueue is called 
				int[] queue2 = new int[sizeOfArray];
				int i;
					
				for(i = 0; i <= count - 1; i++)
				{
					queue2[i] = queue[i + 1];
				}
					
				queue = queue2;
				*/
				
				freeSpace = front;
			}
			else if(front == count && count == sizeOfArray)
			{
				System.out.println("DeQueue From start position");
				data = queue[start];
				start++;
			}
			return data;
			
		}
		
		public void enQueue(int data)
		{
			if(count < sizeOfArray)
			{
				queue[count] = data;
				count++;
			}
			
			else if(freeSpace != 0)
			{
				/*int i;
				for(i = front; i <= count; i++)			
				{
					queue[front - 1] = queue[front];
				}*/
				
				if(start <= freeSpace)
				{
					queue[start] = data;
					
					System.out.println("Inside start <= freeSpace");
					start++;

					count++;
					freeSpace -= 1;
				}
			}
			
			else
			{
				sizeOfArray *= 2;
				int[] queue2 = new int[sizeOfArray];
				int i;
				for(i = 0; i < queue.length; i++)
				{
					queue2[i] = queue[i];
				}
				
				queue2[count] = data;
				count++;
				
				queue = queue2;
			}
		}
		
		
}
