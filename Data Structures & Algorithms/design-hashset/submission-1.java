class MyHashSet {

    private static class Node{
        int key;
        Node next;
        public Node(int key){
            this.key = key;
        }
    }
    
    private Node[] buck;
    private static final int SIZE = 1000;

    public MyHashSet() {
        buck = new Node[SIZE];
    }
    
    public void add(int key) {
        int index = hash(key);
        Node current = buck[index];

        while(current != null){
            if(current.key == key) return;
            current = current.next;
        }
        Node newNode = new Node(key);
        newNode.next = buck[index];
        buck[index] = newNode;
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node prev = null;
        Node current = buck[index];

        while(current != null){
            if(current.key == key){
                if(prev == null)    
                    buck[index]= current.next;
                else{
                    prev.next = current.next;
                } 
            }
            prev = current;
            current = current.next;
        }
    }
    
    public boolean contains(int key) {
        int in = hash(key);
        Node curr = buck[in];
        while(curr != null){
            if(curr.key == key) return true;
            curr = curr.next;
        }
        return false;
    }

    private int hash(int key){
        return key % SIZE;
    }

    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */