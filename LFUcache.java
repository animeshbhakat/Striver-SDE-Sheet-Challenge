import java.io.*;
import java.lang.*;
import java.util.*;
public class LRUCache
{
    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    
    LRUCache(int _capacity)
    {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key)
    {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value)
    {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    
    private void insert(Node node){
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.next = headNext;
        node.prev = head;
        headNext.prev = node;
    }
    
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
 

