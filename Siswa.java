public class Siswa {

	private String nama; //private tidak bisa langsung mengakses data. harus melalui getter dan setter.
	private int no; //kelebihan private, tanpa membuat objek, atribut sudah bisa diakses
	private int nim;

	public Siswa(String nama, int no, int nim) { //construktur merupakan single method yang pertama kali dijalankan meskipun hanya membuat objek saja tanpa memanggilnya
		this.nama = nama; 
		this.no = no;
		this.nim = nim;
	}

	public String getNama() { //getter
	    return nama;
	}

	public void setNama(String nama) { //setter
	    this.nama = nama;
	}

	public int getNo() {
	    return no;
	}

	public void setNo(int no) {
	    this.no = no;
	}

	public int getNim() {
	    return nim;
	}

	public void setNim(int nim) {
	    this.nim = nim;
	}
}