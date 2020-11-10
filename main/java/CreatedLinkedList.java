
public class CreatedLinkedList <T> {

    public MyNode last;
    public MyNode start;
    int size = 0;

    public CreatedLinkedList() {
        this.start = null;
        this.last = null;
    }

    public void addAtStart(MyNode newNode) {
        if (last == null) {
            last = newNode;
        }
        if (start == null) {
            start = newNode;
        } else {
            MyNode temp = start;
            this.start = newNode;
            this.start.setNext(temp);
        }
        size = size + 1;
    }

    public void addAtLast(MyNode newNode) {
        if (start == null) {
            start = newNode;
        }
        if (last == null) {
            last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        size = size + 1;
    }

    public MyNode RemoveAtStart() {
        MyNode temp = this.start;
        this.start = start.getNext();
        size = size - 1;
        return temp;
    }

    public void addAtSelectedPosition(MyNode mySelectedNode, MyNode newNode) {
        MyNode tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
        size = size + 1;
    }

    public void addAfterSearchedPosition(MyNode mySelectedNode, MyNode newNode) {
        MyNode tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }

        newNode.setNext(tempNode.getNext().getNext());
        tempNode.setNext(newNode);
        size = size + 1;
    }

    public int deleteAfterSearch(MyNode nodeToDel) {
        MyNode temp = this.start;
        MyNode previousNode = null;
        while (!temp.getNext().equals(nodeToDel.getNext())) {
            previousNode = temp;
            temp = temp.getNext();
        }

        previousNode.setNext(temp.getNext());
        temp = previousNode;
        size = size - 1;
        return size;
    }

    public MyNode RemoveAtLast() {

        MyNode temp = start;
        while (!temp.getNext().equals(last)) {
            temp = temp.getNext();
        }
        this.last = temp;
        temp = temp.getNext();
        size = size - 1;
        return temp;
    }

    public MyNode findNode(MyNode nodeToFind) {
        MyNode temp = start;
        boolean found = false;
        System.out.println(temp);
        while (temp != null && temp.getNext().equals(nodeToFind)) {
                temp = temp.getNext();
            }
        return temp;
        }

    public void printMyNode(){
        System.out.println("My nodes" +start);
        System.out.println("Size of linked list" +size);
    }
}


