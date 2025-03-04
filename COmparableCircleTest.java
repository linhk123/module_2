package shape;

import java.util.Arrays;

public class COmparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0]=new ComparableCircle(3.6);
        circle[1]=new ComparableCircle();
        circle[2]=new ComparableCircle(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle c : circle) {
            System.out.println(c);
        }
        Arrays.sort(circle);
        System.out.println("After - sorted:");
        for (ComparableCircle c : circle) {
            System.out.println(c);
        }
    }
}
