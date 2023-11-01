import java.util.List;
import java.util.ArrayList;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

public class Solution {
  public static List<String> linkedListValues(Node<String> head) {
      // todo
      List<String> list = new ArrayList<String>();
      Node<String> temp = new Node<>("");
      
      while(head != null){
        temp = head;
        list.add(temp.val);
        head = head.next;
      }
    return list;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    //System.out.println(a.val);
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Solution.linkedListValues(a)); 
    // -> [ "a", "b", "c", "d" ]
  }
}
