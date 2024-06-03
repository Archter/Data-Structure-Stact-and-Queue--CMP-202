public class SimpleStack<T> {

    private Node<T> top;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            // You can throw an exception here if needed
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
