package sorting;

public class InsertionSort {
	
		//sorting function
	    public static void insertionSort(int[] arr) {
	    	//variable for store the length of array
	        int n = arr.length;
	      //sorting process
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            // Place the key element at the correct position
	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 11, 13, 5, 6};
	      //variable for store the length of array
	        int n = arr.length;
	        System.out.println("Unsorted array:");
	        for (int m=0; m<n; m++) {
	            System.out.print(arr[m] + " ");
	        }

	        insertionSort(arr);

	        System.out.println("\nSorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}



