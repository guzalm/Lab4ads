# Lab4ads
CREATING MyHashTable class:

   STEP 1: Creating new java class with name MyHashTable
   
   STEP 2: Adding private class HashNode<>. In a hash table, each node has a key of type K, a value of type V, and a link to the next node.
   The constructor initializes the node with key and value by word 'this' and sets the null value next to it.
   
   STEP 3: Variables 'size','table' are used to store the actual hash table and the number of elements currently stored in it.
   
   STEP 4: We initialized the hash table with a default size of 16 and the hash table with a specified size M.
   
   STEP 5: Creating of Hash() function that returns an index into the table for a given key. It  used as an index into an array to store or retrieve the corresponding value object.
   
   STEP 6: Creating of put() method used to insert a key-value pair into the hash table. This method first computes the hashcode of the key using the hash() method, which determines the index of the corresponding entry in the table array. If the entry at that index is empty, the method simply creates a new HashNode.
   
   STEP 7: The get() method in the MyHashTable class is used to retrieve the value associated with a given key from the hash table.The method first computes the hash code of the key using the hash() method, which determines the index of the corresponding entry in the table array.
   
   Step 8: Method remove() deletes a key_value pair from the table when we put key. If the entry at that index is null, it means there is no such key-value pair in the hash table, so the method returns null. If the entry is not null, the method find the HashNode with the matching key. After removing, size of table decreases.
   
   STEP 9: The contains() method searches the hashtable for a given value. If the value is found, it returns true. If it is not found after searching the entire hashtable, it returns false.
   
   STEP 10: The getkey() method retrieves the key associated with a given value in the hashtable. If it finds a matching node, it returns the key associated with that node. If it does not find a matching node after searching the entire hashtable, it returns null.
   
   CREATING MyTestingClass:
   
     STEP 11: In new created class I have put here private integer field to store the id of the object and private string field to store the name of the object. After was created function MyTestingClass where I added constructor that initializes the id field with the passed value and another one that initializes the name field with the passed value
   
