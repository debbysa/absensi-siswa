import java.util.Scanner;

public class Main {


	static LinkedList listSiswa;
	static Scanner scan;
	static Scanner scString;
	
	public static void initListSiswa() {
		listSiswa = new LinkedList();
		
		Siswa siswa1 = new Siswa("kinci1", 1, 174);
		Siswa siswa2 = new Siswa("kinci2", 2, 184);
		Siswa siswa3 = new Siswa("kinci3", 3, 194);
		Siswa siswa4 = new Siswa("kinci4", 4, 124);

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
		System.out.println("1. Add siswa");
		System.out.println("2. Show data"); 
		System.out.println("3. Update data");
		System.out.println("4. Remove data");
	}

	public static void addSiswa() {
		System.out.print("Inputkan Nama : ");
		String nama = scString.nextLine();
		System.out.print("Inputkan nim : ");
		int nim = scan.nextInt();

		Siswa siswa5 = new Siswa(nama, 5, nim);
		listSiswa.addNode(siswa5);
	}

	public static void showSiswa() {
		for(int i = 1; i <= listSiswa.getCount(); i++){
			System.out.println(listSiswa.get(i).getNama());	
		}
	}

	public static void updateSiswa() {
		System.out.println("========================");
		System.out.println("Data Siswa");
		System.out.println("========================");
		for(int i = 1; i <= listSiswa.getCount(); i++){
			System.out.println(listSiswa.get(i).getNama());	
		}
		System.out.println("========================");

		System.out.print("Masukkan index yang ingin di update : ");
		int index = scan.nextInt();
		System.out.print("masukkan nama : ");
		String nama = scString.nextLine();

		if (index <= 1 || index > listSiswa.getCount()) {
			System.out.println("Tidak ada indeks posisi tersebut\n ");
			System.out.println("size : "+listSiswa.getCount());
		} else{

			Siswa siswaNew = new Siswa(nama, listSiswa.get(index).getNo(), listSiswa.get(index).getNim());
			listSiswa.update(index, siswaNew);

			System.out.println(listSiswa.get(index).getNama());	

		}
	}

	public static void removeSiswa() {
		System.out.print("Masukkan index yang akan dihapus : ");
		int index = scan.nextInt();

		listSiswa.removeNode(index);
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
				default :
				System.out.println("Masukkan sesuai pilihan!");
				break;
				
			}
			
			System.out.println("\n Again ? (Y/T) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}