import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count;
        int[] arr;
        System.out.println("Введите кол-во элементов массива:");
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        System.out.println("Начальные данные:");
        arr =  new int [count];
        for (int i = 0; i < count; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(1000);
            System.out.print(arr[i]+" ");
        }
        int swap;
        for (int i = 0; i < count-1; i++) {

            for (int j = i+1; j < count ; j++) {
                if (arr[i]>arr[j])
                {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }

        }
        System.out.println("Результат:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
