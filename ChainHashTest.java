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
public class ChainHashTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /******************************************************************************
        * Test with the nested node class
        ******************************************************************************/
        
        System.out.println("TEST HASH TABLE WITH INTERNAL PRIVATE NODE CLASS");
        ChainHashTable chainHashNode = new ChainHashTable(10);
        System.out.println("Check if hash table is empty after creating it:");
        System.out.println(chainHashNode.isEmpty());
        System.out.println();// line break
        
        
        // Add elements until all of the keys in the hash table are filled
        System.out.println("Add elements, test the put, empty, size, and get methods:");
        chainHashNode.put(0, 1);
        chainHashNode.put(1, 5);
        chainHashNode.put(2, 9);
        chainHashNode.put(3, 8);
        chainHashNode.put(4, 15);
        chainHashNode.put(5, 27);
        chainHashNode.put(6, 32);
        chainHashNode.put(7, 19);
        chainHashNode.put(8, 22);
        chainHashNode.put(9, 89);
        System.out.println("Empty: " + chainHashNode.isEmpty());
        System.out.println("Size: " + chainHashNode.size());
        System.out.println("Key 2: " + chainHashNode.get(2));
        System.out.println("Key 3: " + chainHashNode.get(3));
        System.out.println("Key 7: " + chainHashNode.get(7));
        System.out.println();// line break
       
        
        // Add duplicate elements to start chaining process
        System.out.println("Add duplicate elements at different keys, test the put and contains methods:");
        chainHashNode.put(10, 4);
        chainHashNode.put(11, 7);
        chainHashNode.put(12, 9);
        chainHashNode.put(13, 23);
        chainHashNode.put(14, 45);
        System.out.println("Size: " + chainHashNode.size());
        
        
        //Test the contains method after adding duplicate elements
        System.out.println("Key 10: " + chainHashNode.get(10));
        System.out.println("Key 12: " + chainHashNode.get(12));
        System.out.println("Key 13: " + chainHashNode.get(13));
        System.out.println("Contains Key 14: " + chainHashNode.contains(14));
        System.out.println("Contains Key 15: " + chainHashNode.contains(15));
        
     
        
        
        // Line Breaks between two test cases
        System.out.println();// line break
        System.out.println();// line break
        System.out.println();// line break
        System.out.println();// line break
        System.out.println();// line break
        // End Line Breaks between two test cases
        
        
  
        
        /******************************************************************************
        * Test with the singly linked list (without the nested node class).
        ******************************************************************************/
        
        System.out.println("TEST HASH TABLE WITH SINGLY LINKED LIST");
        SeparateChainHashing chainHashList = new SeparateChainHashing(10);
        System.out.println("Check if hash table is empty after creating it:");
        System.out.println(chainHashList.isEmpty());
        System.out.println();// line break
        
        
        // Add elements until all of the keys in the hash table are filled
        System.out.println("Add elements, test the put, empty, size, and get methods:");
        chainHashList.put(0, 1);
        chainHashList.put(1, 5);
        chainHashList.put(2, 9);
        chainHashList.put(3, 8);
        chainHashList.put(4, 15);
        chainHashList.put(5, 27);
        chainHashList.put(6, 32);
        chainHashList.put(7, 19);
        chainHashList.put(8, 22);
        chainHashList.put(9, 89);
        System.out.println("Empty: " + chainHashList.isEmpty());
        System.out.println("Size: " + chainHashList.size());
        System.out.println("Key 2: " + chainHashList.get(2));
        System.out.println("Key 3: " + chainHashList.get(3));
        System.out.println("Key 7: " + chainHashList.get(7));
        System.out.println();// line break
       
        
        // Add duplicate elements to start chaining process
        System.out.println("Add duplicate elements at different keys, test the put, size, get, and contains methods:");
        chainHashList.put(10, 4);
        chainHashList.put(11, 7);
        chainHashList.put(12, 9);
        chainHashList.put(13, 23);
        chainHashList.put(14, 45);
        System.out.println("Size: " + chainHashList.size());
        System.out.println("Key 10: " + chainHashList.get(10));
        System.out.println("Key 12: " + chainHashList.get(12));
        System.out.println("Key 13: " + chainHashList.get(13));
        System.out.println("Contains Key 14: " + chainHashList.contains(14));
        System.out.println("Contains Key 15: " + chainHashList.contains(15));
        
        
    }
    
}
