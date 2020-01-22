package com.coding;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		//int[] inputArray = ArrayGenerator.getArray(100);
		int[] arr = new int[] {1,2,3,7,5};
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		subArray(arr1, 15);
	}

	// Using Java 8
	public static void subArray8(int[] inputArray, int sum) {
		// Arrays.stream(inputArray).filter(predicate)
	}

	public static void subArray(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length; i++) {
			boolean status = getSum(inputArray, i, sum);
			if(status)
				break;
		}
	}

	public static boolean getSum(int[] inputArray, int index, int expectedsum) {
		int sum = 0;
		boolean status = true;
		for (int i = index; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			if (sum < expectedsum) {
				continue;
			} else if (sum > expectedsum) {
				status = false;
				break;
			} else {
				System.out.println("Range is :" + (index+1) + " to " + (i+1));
				break;
			}

		}
		return status;
	}

}
