class Solution {
    public int minOperations(int[] a) {
        int b = g(a);
        int c = h(a, b);
        boolean d = i(a, b, c);
        boolean e = j(a, b, c);

        int f = Integer.MAX_VALUE;

        if (d) {
            int l = c;
            int m = b - c + 2;
            f = k(f, k(l, m));
        }

        if (e) {
            int n = (c + 1) % b + 1;
            int o = b - c;
            f = k(f, k(n, o));
        }

        return f == Integer.MAX_VALUE ? -1 : f;
    }

    private int g(int[] p) {
        return p.length;
    }

    private int h(int[] q, int r) {
        for (int s = 0; s < r; s++) {
            if (q[s] == 0) {
                return s;
            }
        }
        return -1;
    }

    private boolean i(int[] t, int u, int v) {
        for (int w = 0; w < u; w++) {
            if (t[(v + w) % u] != w) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int[] x, int y, int z) {
        for (int A = 0; A < y; A++) {
            if (x[(z - A + y) % y] != A) {
                return false;
            }
        }
        return true;
    }

    private int k(int B, int C) {
        return B < C ? B : C;
    }
}