import java.util.*;

public class EsKrim {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> arrData = new ArrayList<String>();
    static int rasa, ganti, hapus, menu;
    static String ubah, nambah, hilangkan;

    static void varianRasa() {
        while (true) {
            System.out.println("\n1. cokelat \n2. vanila \n3. bluberi \n4. stroberi \n5. greentea");
            System.out.print("pilih varian rasa = ");
            rasa = input.nextInt();
            input.nextLine();

            if (rasa==1) {
                arrData.add("cokelat");
            } else if (rasa==2) {
                arrData.add("vanila");
            } else if (rasa==3) {
                arrData.add("bluberi");
            } else if (rasa==4) {
                arrData.add("stroberi");
            } else if (rasa==5) {
                arrData.add("greentea");
            } else {
                System.out.println("varian rasa tidak tersedia.");
            }

            System.out.println("pilihan rasa yang dipilih\n" + arrData);

            System.out.print("\nMau  N A M B A H  rasa? (y/t) = ");
            nambah = input.nextLine();
            nambah = nambah.toLowerCase();

            if(nambah.equals("t")) {
                break;
            }
        }
    }

    static void tampilkanRasa() {
        for (int i = 0; i<arrData.size(); i++) {
            System.out.println(i + ". " + arrData.get(i));
        }
    }
    static void gantiRasa() {
        while (true) {
        System.out.print("\nMau  U B A H  rasa? (y/t) = ");
        ubah = input.nextLine();
        ubah = ubah.toLowerCase();

        if (ubah.equals("y")) {
            System.out.print("tulis nomor yang akan diubah = ");
            int gontaganti = input.nextInt();

            System.out.println("\n1. cokelat \n2. vanila \n3. bluberi \n4. stroberi \n5. greentea");
            System.out.print("pilih pengganti rasa = ");
            ganti = input.nextInt();
            input.nextLine();

                if (ganti==1){
                arrData.set(gontaganti,"cokelat");
                }else if (ganti==2){
                    arrData.set(gontaganti,"vanila");
                }else if(ganti==3){
                    arrData.set(gontaganti,"bluberi");
                }else if (ganti==4){
                    arrData.set(gontaganti,"stroberi");
                }else if (ganti==5){
                    arrData.set(gontaganti,"greentea");
                }else {
                    System.out.println("varian tidak tersedia.");
                }

                tampilkanRasa();

        } else if(ubah.equals("t")) {
            break;
            }
        }
    }

    static void hapusRasa() {
        while (true) {
            System.out.print("\nMau  H A P U S  rasa? (y/t) = ");
            hilangkan = input.nextLine();
            hilangkan = hilangkan.toLowerCase();

            if (hilangkan.equals("y")) {
                System.out.println("\nPesanan Terkini");
                tampilkanRasa();
                System.out.print("\ntulis nomor yang akan dihapus = ");
                hapus = input.nextInt();
                input.nextLine();

                arrData.remove(hapus);
                tampilkanRasa();
            } else if (hilangkan.equals("t")) {
                break;
            }
        }
    }
    public static void main(String[] args) {
    while (true) {
        System.out.println("=====================\nSelamat Datang\n=====================");
        System.out.println("1. Pesan\n2. Ubah\n3. Hapus\n4. Lihat Pesanan\n5. Keluar");
        System.out.print("\nSilahkan pilih menu = ");
        menu = input.nextInt();
        input.nextLine();

        switch (menu) {
            case 1:
                varianRasa();
                break;
            case 2:
                System.out.println("\nPesanan Terkini");
                tampilkanRasa();
                gantiRasa();
                break;
            case 3:
                hapusRasa();
                break;
            case 4:
                System.out.println("\nYANG AKAN ANDA PESAN");
                tampilkanRasa();
                System.out.println("terimakasih telah berkunjung.");
                System.exit(0);
                break;
            case 5:
                System.out.println("terimakasih telah berkunjung.");
                System.exit(0);
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
}