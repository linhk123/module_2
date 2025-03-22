package shape;

import java.util.Scanner;

public class minh_hoa_thuat_toan_sap_xep_chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("old array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        int x, pop;
        for(int i = 1; i < size; i++ ) {
            x = arr[i];
            pop=i;
            while (pop>0 && x<arr[pop-1]) {
                arr[pop]=arr[pop-1];
                pop--;
            }
            arr[pop]=x;
        }
        System.out.println("");
        System.out.print("new array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
