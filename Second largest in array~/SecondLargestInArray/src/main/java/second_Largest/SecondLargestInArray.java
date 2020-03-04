package second_Largest;

/**
 *
 * @author Dinesh Nanda
 */

public class SecondLargestInArray {
    
    public int second(int[] items) {
        int temp;
        int second_largest = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {

                if (items[i] < items[j]) {

                    temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (i == 1) {
                second_largest = items[i];
            }
        }
        return second_largest;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {44, 66, 99, 77, 33, 22, 55};

        SecondLargestInArray arr_obj = new SecondLargestInArray();

        System.out.println("Second largest number in array is: "+arr_obj.second(arr));
        
    }
    
}
