package chap34.collection.link;

public class MyLinkedListV2 {
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

    public void add(int index, Object e){
        Node newNode = new Node(e); //신규노드 생성
        if (index == 0){
            newNode.next = first; //다음을 기존의 노드와 연결
            first = newNode;//first에 newNode가 되었다고 알려준다.

            //중간이나 뒷 부분에 들어가면
        } else {
            Node prev = getNode(index - 1); //직전 노드를 찾고
            newNode.next = prev.next; //직전 노드에 새 노드를 넣는다.
            prev.next = newNode; //직전노드 = 새 노드
        }
        size++;
    }

    //값 setting, 예전값 가져와야 한다.
    public Object set(int index, Object element) {
        Node x = getNode(index); //index에 대한 옛날 값 찾고
        Object oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    public Object remove(int index){
        Node removeNode = getNode(index); //삭제할 노드 찾고
        Object removedItem = removeNode.item; //삭제할 item 지정
        if (index == 0){
            first = removeNode.next; // 첫번째 위치에 삭제

            //first가 아닌 경우
        } else {
            Node prev = getNode(index -1); //직전 노드
            prev.next = removeNode.next; //나의 다음과 나의 직전 값을 서로 연결
        }

        //초기화
        removeNode.item = null;
        removeNode.next = null;
        size --;
        return removedItem;
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
