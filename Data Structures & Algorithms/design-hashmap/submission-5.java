class MyHashMap {
    class Node{
        int k ;
        int v;
        Node n;
        public Node(){};
        public Node(int key ,int  value){
            k = key;
            v = value;
        }
    }
    private Node[] map; 

    public MyHashMap() {
        map = new Node[100];
    }

    private int hash(int key){ return key % 100; }

    public void put(int key, int value) {
        Node cur = map[hash(key)];
        while(cur != null){
            if(cur.k == key){
                cur.v = value;
                return;
            }
            cur = cur.n;
        }
        Node summa = new Node(key , value);
        summa.n = map[hash(key)];
        map[hash(key)] = summa;
    }
    
    public int get(int key) {
        Node cur = map[hash(key)];
        while(cur != null){
            if(cur.k == key){
                return cur.v;
            }
            cur = cur.n;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node cur = map[hash(key)];
        Node pre = null;
        while(cur != null){
            if(cur.k == key && pre == null){
                map[hash(key)] = cur.n;
                
            }
            else if(cur.k == key && pre != null){
                pre.n = cur.n;
            }
            
            pre = cur;
            cur = cur.n;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */