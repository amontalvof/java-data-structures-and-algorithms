package montalvo.dsa.dataStructures.linkedLists.doubly;

public class DoublyNode<T> {
    private T value;
    private DoublyNode<T> prev;
    private DoublyNode<T> next;

    public DoublyNode(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoublyNode<T> getNext() {
        return this.next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public DoublyNode<T> getPrev() {
        return this.prev;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        String prev = this.prev == null ? "null" : this.prev.getValue().toString();
        String next = this.next == null ? "null" : this.next.getValue().toString();
        return "{" +
                " value='" + getValue() + "'" +
                ", prev='" + prev + "'" +
                ", next='" + next + "'" +
                "}";
    }

}
