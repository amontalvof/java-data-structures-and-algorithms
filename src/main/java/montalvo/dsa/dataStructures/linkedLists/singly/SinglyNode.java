package montalvo.dsa.dataStructures.linkedLists.singly;

public class SinglyNode<T> {
    private T value;
    private SinglyNode<T> next;

    public SinglyNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SinglyNode<T> getNext() {
        return this.next;
    }

    public void setNext(SinglyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String next = this.next == null ? "null" : this.next.getValue().toString();
        return "{" +
                " value='" + getValue() + "'" +
                ", next='" + next + "'" +
                "}";
    }

}
