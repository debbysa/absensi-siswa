public class Node {
  
  Siswa value;
  Node next;

  public Node(Siswa value) {
    this.value = value;
    next = null;
  }

  public Node(Siswa value, Node next) {
    this.value = value;
    next = next;
  }

  public Siswa getValue(){
    return this.value;
  }

  public Node getNext(){
    return this.next;
  }

  public void setValue(Siswa value){
    this.value = value;
  }

  public void setNext(Node next){
    this.next = next;
  }
} 