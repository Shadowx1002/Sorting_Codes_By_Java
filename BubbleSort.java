package sorting;

public class BubbleSort {
	

	    public static void bubbleSort(int[] arr) {
	        //variable for store the length of array
	        int n = arr.length;

	        //sorting process
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {

	                    // Create variable to store Swap number
	                    int temp = arr[j];

	                    arr[j] = arr[j + 1];

	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        //Display sorted array
	        System.out.println("\nSorted array:");
	        for (int m=0; m<n; m++) {
	            System.out.print(arr[m] + " ");
	        }

	    }

	    //Main
	    public static void main(String[] args) {
	    	
	        //Hard coded array
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        //variable for store the length of array
	        int n = arr.length;
	        
	        System.out.println("Unsorted array:");

	        //Display unsorted array
	        for (int m=0; m<n; m++) {
	            System.out.print(arr[m] + " ");
	        }

	        //Calling BubbleSort function with Passing parameters(array)
	        bubbleSort(arr);

	        
	    }
	}



