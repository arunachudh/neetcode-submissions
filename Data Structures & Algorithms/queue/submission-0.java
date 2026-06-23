

class Listqueue{
    int val;
    Listqueue next;
    Listqueue prev;
    public Listqueue(){}
    public Listqueue(int val){
        this.val = val;
    }

    public Listqueue(int val, Listqueue next, Listqueue prev){
        this.val = val;
        this.next = next;
        this.prev = prev;

    }
}

class Deque {
    Listqueue head, tail;
    public Deque() {
        Listqueue Deque = new Listqueue(-1);
        head = tail = Deque;
    }

    public boolean isEmpty() {
        if(head==tail&&head.val==-1){
            return true;
        }
        return false;

    }

    public void append(int value) {
        Listqueue newNode = new Listqueue(value);
        if(!isEmpty()) {
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
        else{
            tail.val=value;
        }
    }

    public void appendleft(int value) {
        Listqueue newNode = new Listqueue(value);
        if(!isEmpty()) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
        else{
            head.val =  value;
        }
    }

    public int pop() {
        int vall;
        if(!isEmpty()){
            vall=tail.val;
            if(tail.prev==null){
                tail.val=-1;
                return vall;
            }
            tail.prev.next = null; //setting the next pointer of Tail's previous node to null;
            tail = tail.prev; //Setting tail to the Node previous to tail.
            return vall;
        }
        return -1;
        //tail.prev = null;

    }

    public int popleft() {
        int vall;
        if(!isEmpty()){
            vall=head.val;
            if(head.next==null){
                head.val=-1;
                return vall;
            }
            head.next.prev = null;
            head = head.next;
            return vall;
        }
        return -1;
    }
}
