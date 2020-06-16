package Problems;

public class Sort {
	
	public static void bubbleSort(int[] a) {
		
		for(int loop = a.length ; loop >= 0; loop--) {
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] >= a[i + 1])
				{
					a[i] = a[i] ^ a[i + 1];
					a[i + 1] = a[i] ^ a[i + 1];
					a[i] = a[i] ^ a[i + 1];
				}
			}
		}
	}
	
	public void mergeSort(int[] a) {
		 mergeSortHelper(a,0, a.length - 1);
	}
	
	private void mergeSortHelper(int[] a , int first , int last)
	{
		if(first >= last)
			return;
		
		else {
			int mid = ((first + last) >> 1);
			mergeSortHelper(a , 0 , mid);
			mergeSortHelper(a , mid + 1, last);
			
			System.out.println("first :" + a[first] + " , last : " + a[last]);
			mergeLogic(a , first , last , mid);
		}
		
	}
	
	private void mergeLogic(int[] a , int first , int last , int mid) {
		
		int[] temp = new int[a.length];
		
		int i = first , j = mid + 1 , k = first;
		
		
		while(i <= mid && j <= last) {
			if(a[i] < a[j]) {
				temp[k++] = a[i++];
			}
			
			else
				temp[k++] = a[j++];
				
		}
		
		while(i <= mid) 
			temp[k++] = a[i++];
		
		while(j <= last) 
			temp[k++] = a[j++];
		
		
		for(int n = first; n <= last; n++)
			a[n] = temp[n];
		
	}
	
	public int partitionLogic(int[] a , int low , int high) {
		
		 {
			int left = low , right = high;
			int pivot = a[low];
			
			while(left < right) {
				while(left < right && pivot >= a[left])
					left++;
				
				while(a[right] > pivot)
					--right;
				
				if(left < right) {
					a[left] = a[left] ^ a[right];
					a[right] = a[left] ^ a[right];
					a[left] = a[left] ^ a[right];
				}
			}
			

			a[low] = a[low] ^ a[right];
			a[right] = a[low] ^ a[right];
			a[low] = a[low] ^ a[right];
			
			for(int i : a) {
				System.out.println("Inside Partition logic" + i);
			}
			
			System.out.println();
			return right;
			
			
		}
	}
	
	
	
	public void quickSort(int[] a , int left , int right) {
		
		if(left >= right)
			return;
		
		else {
			
			int partition = partitionLogic(a, left, right);
			quickSort(a, left, partition - 1);
			quickSort(a, partition + 1 , right);
		}
	}
	
	public static void selectionSort(int[] a) {
		
		for(int index = 0; index < a.length - 1; index++) {
			int i = index + 1 ; int minindex = i , min = a[minindex] , flag = 0;
			while(i < a.length) {
				if(a[index] >= a[i] && min >= a[i]) {
					minindex = i;
					flag = 1;
					min = a[minindex];
				}
				
				i++;
			}
			
			if(flag == 1) {
				a[index] = a[index] ^ a[minindex];
				a[minindex] = a[index] ^ a[minindex];
				a[index] = a[index] ^ a[minindex];
			}
		}
	}

}
