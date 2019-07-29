public class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }

    public String toString() {
        return String.format("Node(%d)", val);
    }
}
