class Node{
    int key , val;
    Node next;
    Node(){
        key = -1;
        val = -1;
        next = null;
    }
}


class MyHashMap {

    private Node map[];

    public MyHashMap() {
        map = new Node[1000];
        for(int i = 0 ; i < 1000 ; i++)
            map[i] = new Node();
    }

    private int hash(int key){
        return key % 1000;
    }

    public void put(int key, int val) {
        int in = hash(key);
        Node cur = map[in];
        while(cur != null){
            if(cur.key == key){
                cur.val = val;
                return ;
            }
                
            cur = cur.next;
        }
        cur = new Node();
        cur.key = key;
        cur.val = val;
        cur.next = map[in];
        map[in] = cur;

    }
    
    public int get(int key) {
        int in = hash(key);
        Node cur = map[in];
        while(cur != null){
            if(cur.key == key)
                return cur.val;
            cur = cur.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int in = hash(key);
        Node cur = map[in];
        Node pre = null;
        while(cur != null){
            if(cur.key == key){
                if(pre == null){
                    cur = cur.next;
                    map[in] = cur;
                }
                else{
                    pre.next = cur.next;
                }
                
            }
            pre = cur;
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