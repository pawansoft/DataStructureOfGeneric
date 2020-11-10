import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void Provide3Number_whenAddedInSequence_TestCaseShouldPass()
    {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        MyNode peek = myQueue.peek();

        Assert.assertEquals(firstNode, peek);
    }
}
