package sorting;

public class ModifiedBubbleSort {
	

	    public static void ModifiedBubbleSort(int[] arr) {
	    	//get array length
	        int n = arr.length;
	        //variable of modified bubble sort
	        boolean swapped;
	        //sorting process
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            //checking swap status
	            if (!swapped) break;
	        }
	    }

	    public static void main(String[] args) {
	    	//print unsorted array
	        int[] arr = {65, 34, 25, 12, 22, 11, 90};
	        System.out.println("Unsorted array:");
	        //variable for store the length of array
	        int n = arr.length;
	        for (int m=0; m<n; m++) {
	            System.out.print(arr[m] + " ");
	        }

	        ModifiedBubbleSort(arr);

	        System.out.println("\nSorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}



