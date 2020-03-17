import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] tab = {20, 10, 13, 30, 100, 20, 102, 4, 10, 17};
        System.out.println("Variable unsorted on array: " + Arrays.toString(tab));

        bubbleSort(tab);

        System.out.println("Variable sorted on array: " + Arrays.toString(tab));
    }

    private static void bubbleSort(int[] tab) {
        int lenght = tab.length;
        int temp = 0;
        int range = 0;

        for (int i = 0; i <= tab.length; i++) {

            range = lenght - 1 - i;

            for (int j = 0; j < range; j++) {

                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }

            }
        }

    }
}





