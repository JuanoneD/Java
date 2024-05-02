public class Node {

    private Employer employe;
    private Node nextNode;
    private OldPoint point;

    Node(Employer employer){

        this.employe = employer;
        OldPoint newpoint = new OldPoint();
        this.point = newpoint;
        nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }
    
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    public Employer getEmployer() {
        return this.employe;
    }

    public OldPoint getPoint() {
        return point;
    }
}
