package homework2;

public class LinearSearch {
	
    public static void main(String[] args) {
    	
        int array[] = {8, 6, 9, 1, 0, 4, 7, 2, 5, 3};
        int key = 5;
        
        if (linearSearch(array, key)) {
            System.out.printf("Index = %d", linearSearchIndex(array, key));
        } else {
        	System.out.print("NotFound");
        }

    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) 
            	return i;
        }
        return -1;
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) 
            	return true;
        }
        return false;
    }
}
