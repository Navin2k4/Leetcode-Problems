import java.util.Arrays;
class MyHashMap {
    int[] data;
    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data,-1);
    }
    
    public void put(int key, int value) {
        data[key] = value;
        System.out.print(" null ");
    }
    
    public int get(int key) {
        return data[key];
    }
    public void remove(int key) {
        data[key] = -1;
        System.out.print(" null ");
    }
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // Output: null
        myHashMap.put(2, 2); // Output: null
        System.out.print(myHashMap.get(1));    // Output: 1
        System.out.print(myHashMap.get(3));    // Output: -1
        myHashMap.put(2, 1); // Output: null
        System.out.print(myHashMap.get(2));    // Output: 1
        myHashMap.remove(2); // Output: null
        System.out.print(myHashMap.get(2));    // Output: -1
    }
}


