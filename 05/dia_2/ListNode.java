
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
            this.next = newNode;
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

    private OldPoint getPoint(Node current,int i){

        if(i == 0){
            return current.getPoint();
        }
        return getPoint(current.getNextNode(),i-1);   
    }

    public OldPoint getPoint(int index){

        return getPoint(next,index);
    }

    public int getSize() {
        return size;
    }

    public Node getNext() {
        return next;
    }

    private Node getNode(Node current,int index){
        if(index == 0){
            return current;
        }
        return getNode(current.getNextNode(),index-1);
    }

    public Node getNode(int index){
        if(index >= size){
            return null; 
        }

        return getNode(next,index);
    }
}
