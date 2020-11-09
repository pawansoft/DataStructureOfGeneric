import org.w3c.dom.Node;

public class CreatedLinkedList <T>{

    public MyNode last;
    public MyNode start;

    public CreatedLinkedList() {
        this.start = null;
        this.last = null;
    }

    public void addAtStart(MyNode newNode) {
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

    public void addAtLast(MyNode newNode) {
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

    public MyNode RemoveAtStart() {
        MyNode temp = this.start;
        this.start = start.getNext();
        return temp;
    }


    public void addAtSelectedPosition(MyNode<T> mySelectedNode, MyNode<T> newNode) {
        MyNode<T> tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }
}

