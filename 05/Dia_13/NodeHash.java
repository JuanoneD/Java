public class NodeHash {

    private int data;
    private NodeHash next;

    NodeHash(int value,NodeHash next){

        this.data = value;
        this.next = next;

    }

    public NodeHash getNext() {
        return next;
    }

    public void setNext(NodeHash next) {
        this.next = next;
    };

    public int getData() {
        return data;
    }

}
