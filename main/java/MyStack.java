import org.w3c.dom.Node;

public class MyStack {

    private final CreatedLinkedList linkList;

    public MyStack() {
        this.linkList = new CreatedLinkedList();
    }

    public void push(MyNode myNode) {
        linkList.addAtStart(myNode);
    }

    public void printStack() {
        linkList.printMyNode();
    }

    public MyNode peak() {
        return linkList.start;
    }

    public MyNode pop() {
        return linkList.RemoveAtStart();
    }
}
