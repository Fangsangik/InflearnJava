package chap34.collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++; //하나가 추가 되었기 때문에 사이즈 증가.
    }

    public Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E e){
        Node<E> newNode = new Node(e); //신규노드 생성
        if (index == 0){
            newNode.next = first; //다음을 기존의 노드와 연결
            first = newNode;//first에 newNode가 되었다고 알려준다.

            //중간이나 뒷 부분에 들어가면
        } else {
            Node<E> prev = getNode(index - 1); //직전 노드를 찾고
            newNode.next = prev.next; //직전 노드에 새 노드를 넣는다.
            prev.next = newNode; //직전노드 = 새 노드
        }
        size++;
    }

    //값 setting, 예전값 가져와야 한다.
    public E set(int index, E element) {
        Node<E> x = getNode(index); //index에 대한 옛날 값 찾고
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    public E remove(int index){
        Node<E> removeNode = getNode(index); //삭제할 노드 찾고
        E removedItem = removeNode.item; //삭제할 item 지정
        if (index == 0){
            first = removeNode.next; // 첫번째 위치에 삭제

            //first가 아닌 경우
        } else {
            Node<E> prev = getNode(index -1); //직전 노드
            prev.next = removeNode.next; //나의 다음과 나의 직전 값을 서로 연결
        }

        //초기화
        removeNode.item = null;
        removeNode.next = null;
        size --;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        //노드를 계속 루프를 변경하면서 돌아야 함.
        for (Node<E> x = first; x != null; x = x.next) {
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

    //Node 또한 GenericType 이어야 한다.
    private static class Node<E> {
        E item;

        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append("->");
                }

                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
