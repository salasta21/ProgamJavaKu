import java.util.Arrays;

class Selection {
    static void SelectionSort(int arr[]) {
        int N = arr.length;

        for(int i=0; i<N-1; i++) {
            int indeks = i;
            for(int j=i+1; j<N; j++) {
                if (arr[j] < arr[indeks]) {
                    // proses tukar data
                    int x = arr[j];
                    arr[j] = arr[indeks];
                    arr[indeks] = x;
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
        Selection sort = new Selection();
        int data[] = {22, 15, 21, 6, 11};

        // menampilkan array
        System.out.println("\nSebelum sorting\n"+Arrays.toString(data));
        
        // menampilkan exchange sort
        sort.SelectionSort(data); 
        System.out.println("\nSelection sort ascending"); 
        sort.printArray(data);
    }
}