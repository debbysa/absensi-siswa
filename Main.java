import java.util.Scanner;

public class Main {


	static LinkedList listSiswa;
	static Scanner scan;
	static Scanner scString;
	
	public static void initListSiswa() {
		listSiswa = new LinkedList();
		
		Siswa siswa1 = new Siswa("lupi", 1, 174,"", 1, 0, 2);
		Siswa siswa2 = new Siswa("alvin", 2, 184,"", 1, 0, 1);
		Siswa siswa3 = new Siswa("fajar", 3, 194, "", 5, 1, 0);
		Siswa siswa4 = new Siswa("neila", 4, 124, "", 2, 1, 0);

		listSiswa.addNode(siswa1);
		listSiswa.addNode(siswa2);
		listSiswa.addNode(siswa3);
		listSiswa.addNode(siswa4);
	}

	public static void initScanner() {
		scan = new Scanner(System.in);
		scString = new Scanner(System.in);
	}

	public static void showMenu() {
		System.out.println("========================");
		System.out.println("Absensi Siswa");
		System.out.println("========================");
		showSiswa();
		System.out.println("1. Add siswa");
		System.out.println("2. Show data Siswa"); 
		System.out.println("3. Absen Siswa");
		System.out.println("4. Remove data");
		System.out.println("5. Cari(index)");
		System.out.println("6. Cek Siswa");
		System.out.println("7. Rekap Siswa");
		System.out.println("8. Mahasiswa yang alfa");
		System.out.println("9. Mahasiswa yang Izin");
		System.out.println("10. Mahasiswa yang sakit");
		System.out.println("11. Mahasiswa yang mendapat kompen");
	}

	public static void addSiswa() {
		System.out.print("Inputkan Nama : ");
		String nama = scString.nextLine();
		System.out.print("Inputkan nim : ");
		int nim = scan.nextInt();

		Siswa siswaNew = new Siswa(nama,6, nim,"",0,0,0);
		listSiswa.addNode(siswaNew);
	}

	public static void showSiswa() {
		System.out.println("========================");
		System.out.println("Data Siswa");
		System.out.println("========================");
		System.out.println("Nama\t NIM\t Keterangan\t A\t I\t S\t");
		for(int i = 1; i <= listSiswa.getCount(); i++){
			System.out.print(listSiswa.get(i).getNama()+"\t ");
			System.out.print(listSiswa.get(i).getNim()+"\t ");
			System.out.print(listSiswa.get(i).getKeterangan()+"\t\t ");
			System.out.print(listSiswa.get(i).getAlfa()+"\t ");
			System.out.print(listSiswa.get(i).getIjin()+"\t ");
			System.out.println(listSiswa.get(i).getSakit());	
		}
		System.out.println(" ");
		System.out.println(" ");
	}

	public static void updateSiswa() {

		System.out.println("========================");
		System.out.println("Data Siswa");
		System.out.println("========================");
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getKeterangan().equalsIgnoreCase("")){
				System.out.print(i+" ");
				System.out.println(listSiswa.get(i).getNama());
			}
		}
		System.out.println("========================");

		System.out.print("Masukkan nomor Mahasiswa : ");
		int index = scan.nextInt();
		String nama = "hadir";

		if (index < 1 || index > listSiswa.getCount()) {
			System.out.println("Tidak ada indeks posisi tersebut\n ");
			System.out.println("size : "+listSiswa.getCount());
		} else{

			Siswa siswaNew = new Siswa(listSiswa.get(index).getNama(), listSiswa.get(index).getNo(), listSiswa.get(index).getNim(), nama, 0,0,0);
			listSiswa.update(index, siswaNew);

			//System.out.println(listSiswa.get(index).getNama(), listSiswa.get(index).getKeterangan());	

			System.out.println("========================");
			System.out.println("Data Siswa yang hadir hari ini");
			System.out.println("========================");
			for(int i = 1; i <= listSiswa.getCount(); i++){
				if(listSiswa.get(i).getKeterangan().equalsIgnoreCase("hadir")){
					System.out.println(listSiswa.get(i).getNama());	
				}
			}
			System.out.println("========================");

		}
	}

	public static void removeSiswa() {
		System.out.print("Masukkan index yang akan dihapus : ");
		int index = scan.nextInt();

		listSiswa.removeNode(index);
	}


	public static void cari() {
	    
			System.out.print("Masukkan index yang akan dicari : ");
			int index = scan.nextInt();
			System.out.print("data index "+index+" : "+listSiswa.get(index).getNama());

			// System.exit(0);
	}

	public static void CekSiswa(){
		
			System.out.println("========================");
			System.out.println("Data Siswa");
			System.out.println("========================");
			for(int i = 1; i <= listSiswa.getCount(); i++){
				if(listSiswa.get(i).getKeterangan().equalsIgnoreCase("hadir") || listSiswa.get(i).getKeterangan().equalsIgnoreCase("")){
					System.out.print(listSiswa.get(i).getNama()+"\t");
					System.out.println(listSiswa.get(i).getKeterangan());	
				}
			}
			System.out.println("========================");

	}

	public static void rekapAbsensi(){
		System.out.println("========================");
		System.out.println("Data Siswa");
		System.out.println("========================");
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getKeterangan().equalsIgnoreCase("")){
				System.out.print(i+" ");
				System.out.println(listSiswa.get(i).getNama());
			}
		}
		System.out.println("========================");

		System.out.print("Masukkan nomor Mahasiswa : ");
		int index = scan.nextInt();
		System.out.print("Masukkan keterangan(A/I/S) : ");
		String keterangan = scString.nextLine();

		if (index < 1 || index > listSiswa.getCount()) {
			System.out.println("Tidak ada indeks posisi tersebut\n ");
			System.out.println("size : "+listSiswa.getCount());
		} else{

			if (keterangan.equalsIgnoreCase("A")) {
				int a = listSiswa.get(index).getAlfa() +1;
				Siswa siswaNew = new Siswa(listSiswa.get(index).getNama(), listSiswa.get(index).getNo(), listSiswa.get(index).getNim(), listSiswa.get(index).getKeterangan(), a,listSiswa.get(index).getIjin(),listSiswa.get(index).getSakit());
				listSiswa.update(index, siswaNew);	
			} else if (keterangan.equalsIgnoreCase("I")) {
				int i = listSiswa.get(index).getIjin() + 1;
				Siswa siswaNew = new Siswa(listSiswa.get(index).getNama(), listSiswa.get(index).getNo(), listSiswa.get(index).getNim(), listSiswa.get(index).getKeterangan(), listSiswa.get(index).getAlfa(),i,listSiswa.get(index).getSakit());
				listSiswa.update(index, siswaNew);
			} else if (keterangan.equalsIgnoreCase("S")) {
				int s = listSiswa.get(index).getSakit() + 1;
				Siswa siswaNew = new Siswa(listSiswa.get(index).getNama(), listSiswa.get(index).getNo(), listSiswa.get(index).getNim(), listSiswa.get(index).getKeterangan(), listSiswa.get(index).getAlfa(),listSiswa.get(index).getIjin(),s);
				listSiswa.update(index, siswaNew);
			}

		}
	}

	public static void mahasiswaAlfa(){
		System.out.println("========================");
		System.out.println("Data Siswa yang Alfa");
		System.out.println("========================");
		System.out.println("No\t Nama\t A\t");
		System.out.println("--------------------------");
		int a = 1;
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getAlfa() > 0){
				System.out.print(a+"\t ");
				System.out.print(listSiswa.get(i).getNama()+"\t ");
				System.out.println(listSiswa.get(i).getAlfa());
				a++;
			}
		}
		System.out.println("========================");
	}

	public static void mahasiswaIjin(){
		System.out.println("========================");
		System.out.println("Data Siswa yang Izin");
		System.out.println("========================");
		System.out.println("No\t Nama\t I\t");
		System.out.println("--------------------------");
		int a = 1;
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getIjin() > 0){
				System.out.print(a+"\t ");
				System.out.print(listSiswa.get(i).getNama()+"\t ");
				System.out.println(listSiswa.get(i).getIjin());
				a++;
			}
		}
		System.out.println("========================");
	}

	public static void mahasiswaSakit(){
		System.out.println("========================");
		System.out.println("Data Siswa yang sakit");
		System.out.println("========================");
		System.out.println("No\t Nama\t S\t");
		System.out.println("--------------------------");
		int a = 1;
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getSakit() > 0){
				System.out.print(a+"\t ");
				System.out.print(listSiswa.get(i).getNama()+"\t ");
				System.out.println(listSiswa.get(i).getSakit());
				a++;
			}
		}
		System.out.println("========================");
	}

	public static void hukuman(){
		System.out.println("========================");
		System.out.println("Data Siswa yang mendapat kompensasi");
		System.out.println("========================");
		System.out.println("No\t Nama\t A\t");
		System.out.println("--------------------------");
		int a = 1;
		for(int i = 1; i <= listSiswa.getCount(); i++){
			if(listSiswa.get(i).getAlfa() >= 5){
				System.out.print(a+"\t ");
				System.out.print(listSiswa.get(i).getNama()+"\t ");
				System.out.println(listSiswa.get(i).getAlfa());
				a++;
			}
		}
		System.out.println("========================");
		System.out.println("Untuk melakukan kompensasi, Silakan hubungi admin jurusan Teknologi Informasi");
	}


	public static void main(String[] args) {
		
		initListSiswa();
		initScanner();

		char ch;

		do {
			showMenu();
			int choice = scan.nextInt();

			switch (choice){
				case 1 :
				addSiswa();				
				break;
				case 2 :
				showSiswa();
				break;
				case 3 :
				updateSiswa();				
				break;
				case 4 :
				removeSiswa();
				break;
				case 5 :
				cari();
				break;
				case 6 :
				CekSiswa();
				break;
				case 7 :
				rekapAbsensi();
				break;
				case 8 :
				mahasiswaAlfa();
				break;
				case 9 :
				mahasiswaIjin();
				break;
				case 10 :
				mahasiswaSakit();
				break;
				case 11 :
				hukuman();
				break;
				default :
				System.out.println("Masukkan sesuai pilihan!");
				break;
				
			}
			
			System.out.println("\n Again ? (Y/T) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}