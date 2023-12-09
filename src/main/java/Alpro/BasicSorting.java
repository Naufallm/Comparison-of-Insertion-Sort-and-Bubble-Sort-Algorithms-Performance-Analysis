package Alpro;
import java.util.Arrays;

public class BasicSorting {

    public static void insertionSort(int[] data) {
        long startTime = System.nanoTime(); // Catat waktu awal eksekusi
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        long endTime = System.nanoTime(); // Catat waktu akhir eksekusi
        long duration = endTime - startTime;
        System.out.println("Data setelah diurutkan menggunakan insertion sort:");
        System.out.println(Arrays.toString(data));
        System.out.println("Insertion Sort Time: " + duration + " nanoseconds");
    }

    public static void bubbleSort(int[] data) {
        long startTime = System.nanoTime(); // Catat waktu awal eksekusi
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime(); // Catat waktu akhir eksekusi
        long duration = endTime - startTime;
        System.out.println("Data setelah diurutkan menggunakan bubble sort:");
        System.out.println(Arrays.toString(data));
        System.out.println("Bubble Sort Time: " + duration + " nanoseconds");
    }

    public static void main(String[] args) {
        int[] originalData = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(originalData));

        // Pengurutan dan Perbandingan kecepatan Insertion Sort
        int[] dataInsertion = Arrays.copyOf(originalData, originalData.length);
        insertionSort(dataInsertion);

        // Pengurutan dan Perbandingan kecepatan Bubble Sort
        int[] dataBubble = Arrays.copyOf(originalData, originalData.length);
        bubbleSort(dataBubble);
    }
}
