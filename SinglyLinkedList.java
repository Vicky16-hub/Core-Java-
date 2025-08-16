public class SinglyLinkedList{
    public static class SinglyLL{
        Node head;
        Node tail;
        class Node{
            int data;
            Node next;
            Node(int data) {
                this.data = data;

            }
        }
        public boolean display(){
            Node t=head;
            while (t!=null){
                System.out.println(t.data);
                t=t.next;
            }
            return true;
        }

        public boolean prepend(int data){
           Node node=new Node(data);
            Node temp=head;
            head=node;
            head.next=temp;
            return true;
        }
    }

    public static void main(String[] args) {
        SinglyLL q=new SinglyLL();
        System.out.println(q.prepend(10));
        System.out.println(q.prepend(20));
        System.out.println(q.prepend(30));
        System.out.println(q.display());
    }

}
