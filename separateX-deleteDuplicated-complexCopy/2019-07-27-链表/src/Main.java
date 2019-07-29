import sun.util.resources.cldr.nd.CurrencyNames_nd;

public class Main {

    // 以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    private static Node prepareListForSeparateX1() {
        Node n1 = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(1);
        Node n4 = new Node(1);
        Node n5 = new Node(1);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static Node prepareListForSeparateX2() {
        Node n1 = new Node(9);
        Node n2 = new Node(9);
        Node n3 = new Node(9);
        Node n4 = new Node(9);
        Node n5 = new Node(9);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static Node prepareListForSeparateX3() {
        Node n1 = new Node(9);
        Node n2 = new Node(1);
        Node n3 = new Node(8);
        Node n4 = new Node(2);
        Node n5 = new Node(7);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static void print(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur + " ");
        }
        System.out.println();
    }
    private static void testSeparateX(Solution solution) {
        Node head1 = prepareListForSeparateX1();
        Node result1 = solution.separateX(head1, 5);
        print(result1);

        Node head2 = prepareListForSeparateX2();
        Node result2 = solution.separateX(head2, 5);
        print(result2);

        Node head3 = prepareListForSeparateX3();
        Node result3 = solution.separateX(head3, 5);
        print(result3);
    }

    //删除有序链表中的重复结点
    private static Node prepareListForDeleted1() {
        Node n1 = new Node(9);
        Node n2 = new Node(9);
        Node n3 = new Node(9);
        Node n4 = new Node(9);
        Node n5 = new Node(9);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static Node prepareListForDeleted2() {
        Node n1 = new Node(8);
        Node n2 = new Node(8);
        Node n3 = new Node(9);
        Node n4 = new Node(9);
        Node n5 = new Node(9);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static Node prepareListForDeleted3() {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5;

        return n1;
    }
    private static void testDeleteDuplicated(Solution solution) {
        Node head1 = prepareListForDeleted1();
        Node result1 = solution.deleteDuplicated(head1);
        print(result1);

        Node head2 = prepareListForDeleted2();
        Node result2 = solution.deleteDuplicated(head2);
        print(result2);

        Node head3 = prepareListForDeleted3();
        Node result3 = solution.deleteDuplicated(head3);
        print(result3);

        Node head4 = null;
        Node result4 = solution.deleteDuplicated(head4);
        print(result4);
    }

    //给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。要求返回这个链表的深度拷贝
    private static void testComplexCopy(Solution solution) {
        CNode n1 = new CNode(1);
        CNode n2 = new CNode(2);
        CNode n3 = new CNode(3);
        CNode n4 = new CNode(4);

        n1.random = n3;
        n2.random = n1;
        n3.random = n3;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        CNode result = solution.complexCopy(n1);

        System.out.println("成功");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        testSeparateX(solution);
        testDeleteDuplicated(solution);
        testComplexCopy(solution);
    }
}
