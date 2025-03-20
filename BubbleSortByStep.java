package shape;

import java.util.Scanner;

public class BubbleSortByStep {
    public  static void bubbleSortByStep(int[]list){
        boolean flag = true;
        for(int i=0;i<list.length-1&&flag;i++){
            flag = false;
            for(int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                System.out.print("Array may be sorted and next pass not needed ");
                break;
            }
            System.out.println("List after thhe "+ i+ "sort : ");
            for(int k=0;k<list.length;k++){
                System.out.print(list[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter" + arr.length + " value: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Begin sort processing ");
        bubbleSortByStep(arr);
    }
}
