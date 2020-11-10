public class ShortedLinkedList <T extends Comparable<T>>{

    MyNode<T> start;
    MyNode<T> last;

    public ShortedLinkedList(MyNode<T> start, MyNode<T> last) {
        this.start = start;
        this.last = last;
    }

    public void addInShortedFormat(MyNode<T> newNode)
    {
        if(this.last == null){
            this.last = newNode;
        }
        if (this.start == null){
            this.start = newNode;
        }
        else if (newNode.getKey().compareTo(this.last.getKey()) >= 0)
        {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        else if(newNode.getKey().compareTo(this.start.getKey()) <= 0)
        {
            MyNode<T> temp = this.start;
            this.start = newNode;
            this.start.setNext(temp);
        }
        else {
            MyNode<T> temp = this.start;
            while (newNode.getKey().compareTo((T)temp.getNext().getKey()) >= 0 ){
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }
    public void printMyNode(){
        System.out.println("My nodes" +start);
    }
}
