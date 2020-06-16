package Problems;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] a = {20 , 5 , 10 , 15 , 30 , 25};
//		
//		//Sort.selectionSort(a);;
//		
//		//System.out.println(Sort.partitionLogic(a, 0, a.length - 1));
//		
//		Sort quickSort = new Sort();
//		quickSort.quickSort(a, 0, a.length - 1);
//		
//		for(int i : a)
//		{
//			System.out.println(i);
//		}
		
		Sort sort = new Sort();
		int[] a = {25 , 20 , 10 , 15 , 30 , 5};
		sort.mergeSort(a);
		
		for(int i : a)
		System.out.println(i);
//		
	}

}
