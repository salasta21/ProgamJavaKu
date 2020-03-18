import java.util.*;

class Program8kesatu {
    static ArrayList<Float> nilai = new ArrayList<Float>();
    static Scanner scan = new Scanner(System.in);
    static float data;
    static String yesNo;

    static void tambahData() {
        while (true) {
            System.out.print("Masukkan Nilai = ");
            data = scan.nextFloat();
            scan.nextLine();
            nilai.add(data);

            System.out.print("\nMau input lagi? (y/n)   ");
            yesNo = scan.nextLine();

            if(yesNo.equals("n") || yesNo.equals("N")) {
                break;
            }
        }
    }
        
    static void tampilkanData() {
        boolean file = nilai.isEmpty();
        if (file==true) {
            System.out.println("\nTidak ada data nilai. Silahkan masukkan data nilai terlebih dahulu pada menu Tambah Data Nilai");
        } else {
            for(int i=0; i<nilai.size() ;i++) {
                System.out.println(nilai.get(i));
            }
        }
    }

    static void nilaiTertinggi() {
        while (true) {
            System.out.print("\nPeringkat tertinggi ke = ");
            int peringkat = scan.nextInt();
            scan.nextLine();

            if((peringkat>0) && (peringkat<=nilai.size())){
                Collections.sort(nilai, Collections.reverseOrder());
                System.out.print("Nilai tertinggi ke-"+peringkat+": ");
                System.out.println(nilai.get(peringkat-1));
            }
            else {
                System.out.println("\nPeringkat yang diinputkan tidak valid.");
                System.out.println("silahkan masukkan peringkat > 0 dan <= jumlah data yang sudah diinputkan.");
            }

            System.out.print("\nMau cari nilai tertinggi lagi? (y/n)   ");
            yesNo = scan.nextLine();

            if(yesNo.equals("n") || yesNo.equals("N")) {
                break;
            }
        }
    }

    static void nilaiTerendah() {
        while (true) {
            System.out.print("\nPeringkat terendah ke = ");
            int peringkat = scan.nextInt();
            scan.nextLine();

            if((peringkat>0) && (peringkat<=nilai.size())){
                Collections.sort(nilai);
                System.out.print("Nilai terendah ke-"+peringkat+": ");
                System.out.print(nilai.get(peringkat-1));
            }

            else {
                System.out.println("\nPeringkat yang diinputkan tidak valid.");
                System.out.println("silahkan masukkan peringkat > 0 dan <= jumlah data yang sudah diinputkan.");
            }

            System.out.print("\nMau cari nilai terendah lagi? (y/n)   ");
            yesNo = scan.nextLine();

            if(yesNo.equals("n") || yesNo.equals("N")) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n***** PROGRAM MAX & MIN *****");
            System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Cari Nilai Tertinggi\n4. Cari Nilai Terendah\n5. Keluar");
            System.out.print("Pilih menu = ");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n~~~Input Nilai~~~");
                    tambahData();
                    break;
                case 2:
                    System.out.println("\n~~~Data Nilai~~~");
                    tampilkanData();
                    break;
                case 3:
                    System.out.println("\n~~~Cari Nilai Tertinggi~~~");
                    nilaiTertinggi();
                    break;
                case 4:
                    System.out.println("\n~~~Cari Nilai Terendah~~~");
                    nilaiTerendah();
                    break;
                case 5:
                    System.out.println("\nt e r i m a k a s i h");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nWARNING! pilihan anda tidak tersedia.");
                    break;
            }
        }
    }
}