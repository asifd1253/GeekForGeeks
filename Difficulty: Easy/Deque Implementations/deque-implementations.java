class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        //  code here
        if(!dq.isEmpty()){
            dq.removeLast();
        }
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        if(!dq.isEmpty()){
            return dq.peekFirst();
        }else{
            return -1;
        }
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.offerFirst(x);
    }
}