// Geeks class with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks {
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c) {
        // your code
        clist.add(c);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c) {
        // your code
        if(!clist.contains(c)){
            System.out.println(-1);
            return;
        }
        
        int freq = Collections.frequency(clist, c);
        System.out.println(freq);
    }
}