public class BubbleSort {
	//Set verbose to true if you would like extra information
	//on what is happening
	static boolean verbose = false;
	public static void main(String args[]){
		
		//Create an array to hold the provided numbers
		int toSort[] = {21, 3, 45, 60, 8, 9, 67, 34, 2, 35, 68, 9, 0, 90, 97, 6, 5};
		//Store the sorted values in an array
		int sorted[] = bubbleSort(toSort);
		//Print out the array
		printArray(sorted);
	}
	
	//Swaps the elements at index i and index i+1
	//in the array and returns it 
	private static int[] swapNums(int array[], int i){
		int holder = array[i];
		array[i] = array[i+1];
		array[i+1] = holder;
		return array;
	}
	
	//Returns true if the first integer is bigger than
	//the second integer and so they should be swapped
	private static boolean shouldSwap(int a, int b){
		if(a>b){
			return true;
		}else{
			return false;
		}
	}
	
	//Does a bubble sort and makes use of the other functions
	private static int[] bubbleSort(int toSort[]){
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i = 0; i<toSort.length-1; i++){
				if(shouldSwap(toSort[i], toSort[i+1])){
					if(verbose)
					System.out.println("Swapping " + toSort[i] + " with " + toSort[i+1]);
					toSort = swapNums(toSort, i);
					swapped = true;
				}else{
					if(verbose)
					System.out.println("Not swapping " + toSort[i] + " with " + toSort[i+1]);
				}
			}
		}
		return toSort;
	}
	
	//Prints out an array
	private static void printArray(int array[]){
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}

