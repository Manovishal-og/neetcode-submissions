class Node{
    int key , val;
    Node next;

    public Node(int key , int val , Node next){
        this.key = key;
        this.val = val;
        this.next = next;
    }
    public Node(){
        this(-1,-1,null);
    }
}

class MyHashMap {

    private Node[] map;

    public MyHashMap() {
        map = new Node[1000];
        for(int i = 0 ; i < 1000  ; i++){
            map[i] = new Node();
        }
    }
    private int hash(int key){
        return key % map.length;
    }
    public void put(int key, int value) {
        Node cur = map[hash(key)];
        while(cur != null){
            if(cur.key == key){
                cur.val = value;
                return;
            }
            cur = cur.next;
        }
        Node ne = new Node();
        ne.key = key;
        ne.val = value;
        ne.next =  map[hash(key)];
        map[hash(key)] = ne;

    }
    
    public int get(int key) {
        Node cur = map[hash(key)];
        while(cur != null){
            if(cur.key == key) return cur.val;
            cur = cur.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node cur = map[hash(key)];
        Node prev = null;
        while(cur != null){
            if(cur.key == key){
                if(prev == null)
                    map[hash(key)] = cur.next;
                else    
                    prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;
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