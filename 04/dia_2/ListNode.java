
public class ListNode {
    private int size = 0;
    private Node next = null;

    public void addEmployer(Employer employer){
        addEmployer(this.next,employer);
        size ++;
    }
    public Employer getEmployer(int index){
        if (index >= size){
            return null;
        }

        return getEmployer(this.next,index);
    }

    private void addEmployer(Node current,Employer employer){

        if(current == null){
            Node newNode = new Node(employer);
            next = newNode;
            return;
        }

        if(current.getNextNode() == null){

            Node newNode = new Node(employer);
            current.setNextNode(newNode);
            return;
        }
        
        addEmployer(current.getNextNode(),employer);
    }

    private Employer getEmployer(Node current,int i){
        if(i == 0){
            return current.getEmployer();
        }
        return getEmployer(current.getNextNode(),i-1);
    }

    public int getSize() {
        return size;
    }

    public Node getNext() {
        return next;
    }

}
