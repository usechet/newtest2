package co.edu.uptc.structures;


public NumberSimpleList(){
    head = null;
}
public void insert(int data){
    Node node = new Node(data);

    if(head = null){
        head = node;
    }else{
        Node aux = head;
    }
}
public boolean exist(int data){
    boolean founded = false;
    Node aux = head;
    while(aux != null && founded == false){
        if(aux.data == data){
            exist = true;
    }
    aux = aux.getNext();
}
public boolean isEmpty(){
    return head == null;
}
public String show(){
    String string = "";
    Node temp = head;
    while(temp.getNext() != null){
        string += temp.data + " ";
        temp = temp.getNext();
    }
    string += temp.getData() + "\n"
    return string;
}
public void delete(int data){
    if(head.getValue() == data){
        this.head = head.getNext();
    }else{
        Node preview = null;
        Node aux = head;
        
        while(aux.getData)
    }
}