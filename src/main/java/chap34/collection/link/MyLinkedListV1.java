package chap34.collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++; //하나가 추가 되었기 때문에 사이즈 증가.
    }

    public Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //값 setting, 예전값 가져와야 한다.
    public Object set(int index, Object element) {
        Node x = getNode(index); //index에 대한 옛날 값 찾고
        Object oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        //노드를 계속 루프를 변경하면서 돌아야 함.
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item))
                return index;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
