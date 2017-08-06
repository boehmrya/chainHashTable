/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainhashtable;

/******************************************************************************
 *  A symbol table implemented with a separate chaining hash table.
 *
 *  Note 1: does not support delete().
 *  Note 2: does not do resizing.
 *  Note 3: does not use internal private node class.
 *
 ******************************************************************************/

public class SeparateChainHashing<Key, Value> {

    private int n;       // number of key-value pairs
    private int m;       // hash table size
    private SingleLList[] st;   // array of doubly-linked-list symbol tables

    // create separate chaining hash table
    public SeparateChainHashing() {
        this(997);
    } 

    // create separate chaining hash table with m lists
    public SeparateChainHashing(int m) {
        this.m = m;
        st = new SingleLList[m];
    } 

    // hash value between 0 and m-1
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    } 

    // return number of key-value pairs in symbol table
    public int size() {
        return n;
    } 

    // is the symbol table empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // is the key in the symbol table?
    public boolean contains(Key key) {
        return get(key) != null;
    } 

    // return value associated with key, null if no such key
    public Value get(Key key) {
        int i = hash(key);
        return (Value) st[i].find(key);
    }

    // insert key-value pair into the table
    public void put(Key key, Value val) {
        if (val == null) {
            delete(key);
            return;
        }
        int i = hash(key);
        try {
            boolean valueSet = st[i].set(key, val);
            if (valueSet == true) {
                return;
            }
        }
        catch (NullPointerException e) {
            if (st[i] == null) {
                st[i] = new SingleLList();
            }
            n++;
            st[i].addToStart(key, val);
            return;
        } 
        n++;
        st[i].addToStart(key, val);
        return;
    }

    // delete key (and associated value) from the symbol table.
    public void delete(Key key) {
        throw new UnsupportedOperationException("delete not currently supported");
    }

    
}