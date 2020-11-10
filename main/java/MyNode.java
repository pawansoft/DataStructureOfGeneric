public class MyNode<T> {
    private MyNode next;
    private T key;

    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("MyNode" + "key").append(key).append("}");
        if (next != null) {
            myNodeString.append("->").append(next);
        }
        return myNodeString.toString();
    }
}
