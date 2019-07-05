

public class Main {
    public static void main(String args[]) {
        int array[] = {4, 3, 2, 1};
        int arraySecond[] = {1, 2, 3, 4};
        array = creatNewArray(array, arraySecond);
        printArray(array);
    }

    private static void printArray(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] creatNewArray(int arrayA[], int arrayB[]) {
        int length = arrayA.length + arrayB.length;
        int newArray[] = new int[length + 1];
        for (int i = 0; i < arrayA.length; i++) {
            newArray[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            newArray[arrayA.length + i] = arrayB[i];
        }
        return newArray;
    }
}
