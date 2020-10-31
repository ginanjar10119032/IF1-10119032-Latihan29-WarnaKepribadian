package if1.pkg10119032.latihan29.warnakepribadian;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * warna kepribadian ke layar
 */
public class IF110119032Latihan29WarnaKepribadian {

    //kamus warna teks
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    //kamus warna background teks
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    
    public static void main(String[] args) {
        //menulis bagian pembuka program
        System.out.print(ANSI_RED + "YUK " + ANSI_RESET);
        System.out.print(ANSI_GREEN + "CEK " + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "KEPRIBADIANMU " + ANSI_RESET);
        System.out.print(ANSI_CYAN + "DARI " + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "WARNA " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "FAVORITMU" + ANSI_RESET);
        
        //menulis teks dengan latar berwarna
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE +"\n\tMERAH\t\t"+ ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE +"\tHIJAU\t\t"+ ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_WHITE +"\tKUNING\t\t"+ ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_WHITE +"\tBIRU\t\t"+ ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_WHITE +"\tUNGU\t\t"+ ANSI_RESET);
        
        //pengguna memasukkan warna yang dipilih
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warna = scan.nextLine();
        System.out.print("NAMA KAMU : ");
        String nama = scan.nextLine();
        
        //menampilkan hasil kepribadian
        System.out.print("\n===== HASIL TES KEPRIBADIAN ");
        System.out.println(nama.toUpperCase() + " =====");
        
        String warnaBesar = warna.toUpperCase();
        switch(warnaBesar){
            case "MERAH" :
                System.out.print("Warna favoritmu adalah ");
                System.out.println(ANSI_RED + "MERAH" + ANSI_RESET);
                System.out.println("1. Pemberani,\n"
                        + "2. Pekerja keras,\n"
                        + "3. Mudah sombong ketika sedikit diatas orang lain,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Mudah berbaur dengan orang lain,\n"
                        + "6. Memiliki ego yang tinggi dan tidak mau mengalah,\n"
                        + "7. Mudah marah.");
                break;
            case "HIJAU" :
                System.out.print("Warna favoritmu adalah ");
                System.out.println(ANSI_GREEN + "HIJAU" + ANSI_RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING" :
                System.out.print("Warna favoritmu adalah ");
                System.out.println(ANSI_YELLOW + "KUNING" + ANSI_RESET);
                System.out.println("1. Memiliki ambisi yang besar,\n"
                        + "2. Terkadang bersikap keras kepala dan angkuh,\n"
                        + "3. Menyukai sesuatu yang baru,\n"
                        + "4. optimis,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Mampu menjadi pusat perhatian\n"
                        + "7. Terkadang terkesan lebay ketika menanggapi sesuatu");
                break;
            case "BIRU" :
                System.out.print("Warna favoritmu adalah ");
                System.out.println(ANSI_BLUE + "BIRU" + ANSI_RESET);
                System.out.println("1. Kurang menyukai keramaian,\n"
                        + "2. Melakukan sesuatu hanya jika tertarik,\n"
                        + "3. Kurang pandai bergaul,\n"
                        + "4. optimis,\n"
                        + "5. Mengutamakan bekerja cerdas, bukan bekerja keras,\n"
                        + "6. Kurang suka menjadi pusat perhatian\n"
                        + "7. Terkesan kalem tapi sebenarnya hanya malas");
                break;
            case "UNGU" :
                System.out.print("Warna favoritmu adalah ");
                System.out.println(ANSI_PURPLE + "UNGU" + ANSI_RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Tidak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang memiliki "
                        + "mental yang kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab "
                        + "seringkali menutup perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Harap memasukkan warna yang telah tercantum");
        }
    }
    
}
