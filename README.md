# Lab4ads
CREATING MyHashTable class:

   STEP 1: Creating new java class with name MyHashTable
   
   STEP 2: Adding private class HashNode<>. In a hash table, each node has a key of type K, a value of type V, and a link to the next node.
   The constructor initializes the node with key and value by word 'this' and sets the null value next to it.
   
   STEP 3: Variables 'size','table' are used to store the actual hash table and the number of elements currently stored in it.
   
   STEP 4: We initialized the hash table with a default size of 16 and the hash table with a specified size M.
   
   STEP 5: Creating of Hash() function that returns an index into the table for a given key. It  used as an index into an array to store or retrieve the corresponding value object.
   
   STEP 6: Creating of put() method used to insert a key-value pair into the hash table. This method first computes the hashcode of the key using the hash() method, which determines the index of the corresponding entry in the table array. If the entry at that index is empty, the method simply creates a new HashNode.
   
