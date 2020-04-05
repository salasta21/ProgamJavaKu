import java.util.Arrays;

class Bubble {
    static void BubbleSort(int arr[]) {
        int N = arr.length;

        for(int i=0; i<N; i++) {
            for(int j=1; j<N-i; j++) {
                if (arr[j-1] < arr[j]) {
                    // proses tukar data
                    int x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;
                }
            }
        }
    }

    void printArray(int arr[]) { 
        int N = arr.length;
        for (int i=0; i<N; ++i) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        Bubble sort = new Bubble();
        int data[] = {22, 15, 21, 6, 11};

        // menampilkan array
        System.out.println("\nSebelum sorting\n"+Arrays.toString(data));
        
        // menampilkan exchange sort
        sort.BubbleSort(data);
        System.out.println("\nBubble sort descending"); 
        sort.printArray(data);
    }
}