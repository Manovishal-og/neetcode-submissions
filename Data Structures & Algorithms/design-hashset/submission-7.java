class MyHashSet {

    class Node{
        int k;
        Node n;
        public Node(){}
        public Node(int a){
            k = a;
            n = null;
        }
    }

    private Node[] set;
    
    public MyHashSet() {
        set = new Node[1000];
    }

    private int hash(int key){ return key % 1000 ; }
    
    public void add(int key) {
        Node curr = set[hash(key)];
        while(curr != null){
            if(curr.k == key) return;
            curr = curr.n;
        }
        Node ne = new Node(key);
        ne.n = set[hash(key)];
        set[hash(key)] = ne ;
    }
    
    public void remove(int key) {
        Node cur = set[hash(key)];
        Node pre = null ;
        while(cur != null){
            if(cur.k == key && pre == null){
                set[hash(key)] = cur.n;
            }
            else if(cur.k == key && pre != null){
                pre.n = cur.n;
            }

            pre = cur;
            cur = cur.n;
        }
    }
    
    public boolean contains(int key) {
        Node cur = set[hash(key)];
        while(cur != null){
            if(cur.k == key) return true;
            cur = cur.n;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */