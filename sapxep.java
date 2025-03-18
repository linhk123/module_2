import java.util.Arrays;
import java.util.Scanner;

public class sapxep {
    public static void main(String[] args) {
        System.out.print(" nhap vao chuoi bat ki: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Cac ki tu trong chuoi la: ");
        char [] chars =s.toCharArray();
        Arrays.sort(chars);
        String s1 = new String(chars);
        System.out.println("CHUOI SAU KHI SAP XEP"+s1);
    }
}
