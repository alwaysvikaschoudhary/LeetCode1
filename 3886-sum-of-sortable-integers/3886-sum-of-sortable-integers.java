class Solution {
    public int sortableIntegers(int[] a) {
        int b = a.length;
        int c = 0;
        
        for (int d = 1; d <= b; d++) {
            if (e(b, d)) {
                if (k(a, d, b)) {
                    c = h(c, d);
                }
            }
        }
        
        return c;
    }

    private boolean e(int f, int g) {
        return f % g == 0;
    }

    private int h(int i, int j) {
        return i + j;
    }

    private boolean k(int[] l, int m, int n) {
        int o = Integer.MIN_VALUE;
        boolean p = true;
        
        for (int q = 0; q < n; q += m) {
            int r = l[q];
            int s = l[q];
            int t = 0;
            
            for (int u = q; u < q + m - 1; u++) {
                if (l[u] > l[u + 1]) {
                    t++;
                }
                
                r = Math.min(r, l[u + 1]);
                s = Math.max(s, l[u + 1]);
            }
            
            if (l[q + m - 1] > l[q]) {
                t++;
            }
            
            if (t > 1) {
                return false;
            }
            
            if (!p && o > r) {
                return false;
            }
            
            p = false;
            o = s;
        }
        
        return true;
    }
}