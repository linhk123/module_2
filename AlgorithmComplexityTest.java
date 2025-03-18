import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int[] arr = new int[255];
        for (int i = 0; i < s.length(); i++) {
            int ascii =(int) s.charAt(i);
            arr[ascii]+=1;
            int max =0;
            char ch = (char) 255;
            for (int j = 0; j <255; j++) {
                if (arr[j]>max) {
                    max = arr[j];
                    ch = (char) j;
                }
            }
            System.out.println("the most appearing letter is "+ch+"with a frequency of "+max+" times");
           
        }
    }
}
