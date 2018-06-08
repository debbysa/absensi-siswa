import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Siswa siswa1 = new Siswa("kinci1", 1, 174);
		Siswa siswa2 = new Siswa("kinci2", 2, 184);
		Siswa siswa3 = new Siswa("kinci3", 3, 194);
		Siswa siswa4 = new Siswa("kinci4", 4, 124);

		Node node1 = new Node(siswa1);

		LinkedList listSiswa = new LinkedList(node1);
		listSiswa.addNode(siswa2);
		listSiswa.addNode(siswa3);
		listSiswa.addNode(siswa4); 
		listSiswa.update(2, siswa4);

		System.out.println(listSiswa.get(2).getNama());
		
			char ch;

		do{

			Scanner scan = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

			System.out.println("========================");
			System.out.println("Absensi Siswa");
			System.out.println("========================");
			System.out.println("1. Add siswa");
			System.out.println("2. Show data"); 
			System.out.println("3. Update data");
			System.out.println("4. Remove data");
			int choice = scan.nextInt();

			switch (choice){
				case 1 :
				System.out.print("Inputkan Nama : ");
				String nama = scString.next();
				System.out.print("\n Inputkan nim : ");
				int nim = scan.nextInt();

				Siswa siswa5 = new Siswa(nama, 5, nim);
				listSiswa.addNode(siswa5);
				break;
				case 2 :
					for(int i = 1; i <= listSiswa.getCount(); i++){
						System.out.println(listSiswa.get(i).getNama());	
					}
					
				break;
				case 3 :
				
				break;
				case 4 :
				
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