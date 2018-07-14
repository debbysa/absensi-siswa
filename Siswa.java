public class Siswa {

	private String nama; //private tidak bisa langsung mengakses data. harus melalui getter dan setter.
	private int no; //kelebihan private, tanpa membuat objek, atribut sudah bisa diakses
	private int nim;
	private String keterangan;
	private int alfa;
	private int ijin;
	private int sakit;

	public Siswa(String nama, int no, int nim, String keterangan, int alfa, int ijin, int sakit) { //construktur merupakan single method yang pertama kali dijalankan meskipun hanya membuat objek saja tanpa memanggilnya
		this.nama = nama; 
		this.no = no;
		this.nim = nim;
		this.keterangan = keterangan;
		this.alfa = alfa;
		this.ijin = ijin;
		this.sakit = sakit;
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

	public int getAlfa() {
	    return alfa;
	}

	public void setAlfa(int alfa) {
	    this.alfa = alfa;
	}

	public int getIjin() {
	    return ijin;
	}

	public void setIjin(int ijin) {
	    this.ijin = ijin;
	}

	public int getSakit() {
	    return sakit;
	}

	public void setSakit(int sakit) {
	    this.sakit = sakit;
	}

	public String getKeterangan() {
	    return keterangan;
	}

	public void setKeterangan(String keterangan) {
	    this.keterangan = keterangan;
	}
}