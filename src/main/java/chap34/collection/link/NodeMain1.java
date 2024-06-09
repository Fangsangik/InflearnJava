package chap34.collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B"); //first가 가지고 있는 next에 B가 들어있는 Node 참조값 연결
        first.next.next = new Node("C"); //first가 가지고 있는 next에 C가 들어있는 Node 참조값 연결

        System.out.println("모든 노드 탐색하기");
        Node x = first; //x에 첫번째를 놓고
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
