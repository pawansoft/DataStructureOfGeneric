import org.w3c.dom.Node;

public class CreatedLinkedList <T>{

    public MyNode last;
    public MyNode start;

    public CreatedLinkedList() {
        this.start = null;
        this.last = null;
    }

    public void addAtLast(MyNode newNode) {
        if(last == null) {
            last = newNode;
        }
        if(start == null){
            start = newNode;
        }
        else {
            MyNode temp = start;
            this.start = newNode;
            this.start.setNext(temp);
        }
    }

    public void addAtStart(MyNode newNode) {
        if(start == null) {
            start = newNode;
        }
        if (last == null){
            last =newNode;
        }
        else{
            this.last.setNext(newNode);
            this.last = newNode;
        }
    }
}
