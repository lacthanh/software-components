package homework2;

public class BubbleSort {
	
    public static void main(String[] args) {
        int[] array = {8, 6, 9, 1, 0, 4, 7, 2, 5, 3};
        bubbleSort(array);
        print(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
        }
    }

    static void print(int[] array) {
        if (array.length == 1) {
        	System.out.print("[" + array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else if (i == array.length - 1) {
                    System.out.print(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
    }
}
