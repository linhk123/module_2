public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,59,60,66,69,70,79};
    static int binarySearch(int[] arr, int key) {
        int low =-1;
        for( int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                low = i;
                break;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 11));
    }
}
