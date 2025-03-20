package shape;

public class SelectionSort {
    static double[] list= {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void SelectionSort(double[] list) {
        for (int i=0; i< list.length- 1; i++) {
            double currentMin =list[i];
            int currentIndex =i;
            for (int j=i+1; j< list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        SelectionSort(list);
        for (int i=0; i< list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
