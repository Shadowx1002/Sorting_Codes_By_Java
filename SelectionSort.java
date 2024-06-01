package sorting;

public class SelectionSort {
	

	   
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        // One by one move 
	        for (int i = 0; i < n-1; i++) {
	        	
	            // Find the minimum element in the unsorted part of the array
	        	
	            int min = i;
	            for (int j = i+1; j < n; j++) {
	                if (arr[j] < arr[min]) {
	                    min = j;
	                }
	            }

	            // Swap the found minimum element with the first element of the unsorted part
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 11, 100, 5, 6};
	      //variable for store the length of array
	        int n = arr.length;
	        
	        //printing arrays
	        System.out.println("Unsorted array:");
	        for (int m=0; m<n; m++) {
	            System.out.print(arr[m] + " ");
	        }

	        selectionSort(arr);

	        System.out.println("\nSorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}



