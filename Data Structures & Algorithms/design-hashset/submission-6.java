class Node{
        int key ;
        Node next;

        public Node(int key ){
            this.key = key;
        }
            Node(){
        key = -1;
        next = null;
    }
    }



class MyHashSet {


    private  Node[] buck;

    private static final int SIZE = 1000;

    public MyHashSet() {
        buck = new Node[SIZE];
        for(int i =0 ; i < 1000 ; i++)
            buck[i] = new Node();
    }
    
    public Boolean contains(int key){
        int in = hash(key);
        Node cur = buck[in];
        while(cur != null){
            if(cur.key == key) return true;
            cur = cur.next;
        }
        return false;
    }

    public void add(int key) {
        int in = hash(key);
        Node cur = buck[in];
        while(cur != null){
            if(cur.key == key) return;
            cur = cur.next;
        }
        Node ne = new Node(key);
        ne.next = buck[in];
        buck[in] = ne;
    }
    
    public void remove(int key) {
        int in = hash(key);
        Node prev = null ;
        Node cur = buck[in];
        
        while( cur != null){
            if(cur.key == key){
                if(prev == null)
                    buck[in] = cur.next;
                else
                    prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }
        

        
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