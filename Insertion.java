import java.util.Arrays;

class Insertion {
    static void InsertionSort(int arr[]) {
        int N = arr.length;

        for(int i=1; i<N; i++) {
            int j=i-1;
            while (j>0 && arr[j]<arr[i]) {
                // proses tukar data
                int x = arr[j];
                arr[j] = arr[i];
                arr[i] = x;
                i--;
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
        Insertion sort = new Insertion();
        int data[] = {22, 15, 21, 6, 11};

        // menampilkan array
        System.out.println("\nSebelum sorting\n"+Arrays.toString(data));
        
        // menampilkan exchange sort
        sort.InsertionSort(data); 
        System.out.println("\nInsertion sort descending"); 
        sort.printArray(data);
    }
}