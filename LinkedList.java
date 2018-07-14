public class LinkedList {
    // properties
    Node head;
    int count;

    // constructors
    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public LinkedList (Node head){
        this.head = head;
        this.count = 1;
    }

    // methods
    public void addNode(Siswa value) {
        Node current = head;
        Node temp = new Node(value);
        
        if(current == null){
            this.head = temp;
            count++;
            return;
        } 

        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count += 1;
    }

    public void removeNode(int index){

        if(isEmpty() || index >= count) System.out.println("Nilai index diluar batas");
            if(index == 0){
                Node prev = head;
                Node cur = head.next; 
                prev = cur;
                cur = prev.next;
            } 
            else{
                Node prev = head;
                Node cur = head.next;
                for(int i = 1; i < index; i++){
                    prev = cur;
                    cur = prev.next;
                }
                prev.next = cur.next;
            }
            count--;



        // Node current = head;

        // if(current == null) {
        //     System.out.println("linkedlist kosong!");
        //     return;
        // }

        // else if(getCount() == 1) {
        //     System.out.println("only one Node in Linked List, deleting Node");
        //     this.head = null;
        //     count--;
        //     return;
        // }

        // while(current.getNext().getNext() != null) {
        //     current = current.getNext();
        // }
        // current.setNext(null);
        // count--;
    }

    public int getCount() {
        return this.count;
    }

    public Boolean isEmpty() {
        return getCount() == 0;
    }

    public Siswa get(int nodeNum) {
        Node current = head;
        
        for(int i = 1; i < nodeNum; i++) {
            current = current.getNext();
        }
        
        return current.getValue();
    }


    public void update(int nodeNum, Siswa value) { //perpaduan SET dan GET
        Node current = head;
        
        for(int i = 1; i < nodeNum; i++) {
            current = current.getNext();
        }

        current.setValue(value);
    }


    public Siswa getByNo(int no) {
        Node current = head;

        while(current.getValue().getNo() != no) {
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                return null;
            }
        }

        return current.getValue();
    }

    public Siswa getNama(int index){
        Node current = head;

        for(int i = 0; i< index; i++){
            current = current.next;
        }

        // while(current.getNext() != null){
        //     if (current.getValue() == index) {
               
        //         break;
        //     }
        //     current.getNext();
        // }
         return current.getValue();

    }

    public Siswa getByNim(int nim) {
        Node current = head;

        while(current.getValue().getNim() != nim) {
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                return null;
            }
        }

        return current.getValue();
    }
}