/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainhashtable;


/**
 *
 * @author Ryan Boehm
 */
public class SingleLList<T> {
    
    private class Node {
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    } //End of Node inner class


    private Node head;

    public SingleLList( ) {
        head = null;
    }

    /**
    Adds a node at the start of the list with the specified data.
    The added node will be the first node in the list.
    */
    public void addToStart(T key, T val) {
        head = new Node(key, val, head);
    }

    /**
    Removes the head node and returns true if the list contains at
    least one node. Returns false if the list is empty.
    */
    public boolean deleteHeadNode( ) {
        if (head != null) {
            head = head.next;
            return true;
        }
        else
            return false;
    }

    /**
     * Returns the number of nodes in the list.
    */
    public int size() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }

    /**
     * Returns True if the linked list contains the key, otherwise returns false.
     */
    public boolean contains(T key) {
        return (find(key) != null);
    }

    
    /**
     * Finds the first node containing the target key, and returns the
     * corresponding value. If target is not in the list, null is returned.
    */
    public Object find(T key) {
        for (Node x = head; x != null; x = x.next) {
            if (key.equals(x.key)) 
		return x.val;
        }
        return null;
    }
    
    
    /**
     * Finds the first node containing the target key, and changes this
     * nodes value to the value entered as a parameter.
    */
    public boolean set(T key, T val) {
        for (Node x = head; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Prints out the keys and values for every item in the linked list.
     */
    public void outputList( ) {
        Node position = head;
        while (position != null) {
            System.out.println( "Key: " + position.key );
            System.out.println( "Val: " + position.val );
            position = position.next;
        }
        System.out.println(); // line break
    }

    public boolean isEmpty( ) {
        return (head == null);
    }

    public void clear( ) {
        head = null;
    }
    
     
}
