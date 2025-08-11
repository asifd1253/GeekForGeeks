Idea (simple)
You must swap the k-th node from the start (call it X) with the k-th node from the end (call it Y) by changing pointers.
Key observations:

Let n = length of list.

If k > n → nothing to do, return head.

If X and Y are the same node (this happens when 2k-1 == n, i.e. the middle of an odd-length list), nothing to do.

To swap nodes, you need:

prevX (node before X), and X

prevY (node before Y), and Y

Special care when nodes are adjacent, or when one of them is the head (so prevX or prevY may be null).

Algorithm (high level)
Count n.

If k > n return head.

If 2*k - 1 == n return head (same node).

Find prevX and X (walk k-1 steps).

Find prevY and Y (walk n-k steps to reach prevY, so Y is prevY.next).

If X.next == Y (X immediately before Y) handle adjacency X→Y specially.

Else if Y.next == X (Y immediately before X) handle adjacency Y→X specially.

Else (non-adjacent) rewire:

if prevX != null set prevX.next = Y else head = Y

if prevY != null set prevY.next = X else head = X

swap X.next and Y.next

Return head.



class Solution {
    public Node swapKthNode(Node head, int k) {
        if (head == null) return head;

        // 1) count nodes
        int n = 0;
        Node t = head;
        while (t != null) {
            n++;
            t = t.next;
        }

        // 2) invalid k
        if (k > n) return head;

        // 3) same node (middle in odd length)
        if (2 * k - 1 == n) return head;

        // 4) find prevX and X (k-th node from start)
        Node prevX = null, X = head;
        for (int i = 1; i < k; i++) {
            prevX = X;
            X = X.next;
        }

        // 5) find prevY and Y (k-th node from end)
        Node prevY = null, Y = head;
        for (int i = 1; i <= n - k; i++) {
            prevY = Y;
            Y = Y.next;
        }

        // 6) if X and Y are the same (extra safety)
        if (X == Y) return head;

        // 7) handle adjacency: X immediately before Y
        if (X.next == Y) {
            // link prevX -> Y (or head = Y)
            if (prevX != null) prevX.next = Y;
            else head = Y;

            // rewire X and Y
            X.next = Y.next;
            Y.next = X;
            return head;
        }

        // 8) adjacency: Y immediately before X
        if (Y.next == X) {
            if (prevY != null) prevY.next = X;
            else head = X;

            Y.next = X.next;
            X.next = Y;
            return head;
        }

        // 9) non-adjacent general case
        if (prevX != null) prevX.next = Y;
        else head = Y;

        if (prevY != null) prevY.next = X;
        else head = X;

        // swap next pointers
        Node tmp = X.next;
        X.next = Y.next;
        Y.next = tmp;

        return head;
    }
}


