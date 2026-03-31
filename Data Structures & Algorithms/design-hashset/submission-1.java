class MyHashSet {
    private List<Integer> data;

    public MyHashSet() {
        this.data = new ArrayList<>();
        // When we call the constructor of MyHashSet, we can set up the initial 
        // "starting" state
    }
    
    public void add(int key) {
        // Lists can permit duplicates, which is not what we'd want for a hashset
        // A hashset does NOT permit duplicates 
        // Here, if we're using a List data structure, we'd need to use a guard 
        // To ensure that the key hasn't been added before 
        if (!this.data.contains(key)) {
            this.data.add(key);
        }
        
    }
    
    public void remove(int key) {
        // List removals are slightly tricky, because if we were going to remove 
        // Based off the key only, then they'd removing the element at a 
        // designated index within the ArrayList
        // We need to ensure we have performing the removal of an actual Integer object 
        // NOT by Index 
        data.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        // This has a return result, which is going to be a boolean 
        // Lists also have a built-in function that lets you determine 
        // If a key is present 
        return this.data.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */