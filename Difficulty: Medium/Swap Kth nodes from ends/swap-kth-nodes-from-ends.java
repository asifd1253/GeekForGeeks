class Solution {
    public Node swapKthNode(Node head, int k) {
        if (head == null) return head;

        int n = 0;
        Node t = head;
        while (t != null) {
            n++;
            t = t.next;
        }

        if (k > n) return head;
        if (2 * k - 1 == n) return head; // same node, no swap

        // Find k-th from start
        Node prevX = null, x = head;
        for (int i = 1; i < k; i++) {
            prevX = x;
            x = x.next;
        }

        // Find k-th from end
        Node prevY = null, y = head;
        for (int i = 1; i <= n - k; i++) {
            prevY = y;
            y = y.next;
        }

        // Adjust previous nodes
        if (prevX != null) prevX.next = y;
        else head = y;

        if (prevY != null) prevY.next = x;
        else head = x;

        // Swap next pointers
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;

        return head;
    }
}
