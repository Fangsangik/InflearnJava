package chap34.collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("c");

        System.out.println(first);

        //모든 노드 탐색 하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 반환하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index 노드 조회하기
        int index = 2;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void add(Node node, String param) {
        //우선 마지막에 연결
        Node lastNode = getLastNode(node);
        lastNode.next = new Node("param"); //마지막 노드에 연결
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) { //index만큼 호출 하면 된다.
            x = x.next;
        }

        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x != null){
            x = x.next;
        }
        return x;
    }

    public static void printAll(Node node){
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
