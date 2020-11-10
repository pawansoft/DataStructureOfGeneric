public class MyQueue {


    private final CreatedLinkedList linkList;

    public MyQueue() {
        this.linkList = new CreatedLinkedList();
    }

    public void enqueue(MyNode newNode) {
        linkList.addAtStart(newNode);
    }

    public MyNode peek() {
        return linkList.last;
    }
}
