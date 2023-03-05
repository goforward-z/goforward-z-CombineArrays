
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length]; // Create a new array with a length equal to the sum of the lengths of arr1 and arr2

        int index = 0; // Initialize an index variable to keep track of the current index in the new array
        for (int num : arr1) { // Copy the elements of arr1 into the new array
            result[index] = num;
            index++;
        }
        for (int num : arr2) { // Copy the elements of arr2 into the new array
            result[index] = num;
            index++;
        }

        return result;
    }
}
