import java.util.Arrays;

class Exchange {
    static void ExchangeSort(int arr[]) {
        int N = arr.length;

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if (arr[i] < arr[j]) {
                    // proses tukar data
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
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
        Exchange sort = new Exchange();
        int data[] = {22, 15, 21, 6, 11};

        // menampilkan array
        System.out.println("\nSebelum sorting\n"+Arrays.toString(data));
        
        // menampilkan exchange sort
        sort.ExchangeSort(data); 
        System.out.println("\nExchange sort descending"); 
        sort.printArray(data);
    }
}