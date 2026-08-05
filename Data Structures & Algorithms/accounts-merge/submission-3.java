class Solution {
    class disjoint {
        int[] par;
        int[] rank;
        disjoint(int n) {
            par = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) par[i] = i;
        }

        int find(int u) {
            if (par[u] != u)
                par[u] = find(par[u]);
            return par[u];
        }

        void union(int u, int v) {
            int rootu = find(u);
            int rootv = find(v);

            if (rootv != rootu) {
                if (rank[rootv] < rank[rootu])
                    par[rootv] = rootu;
                else if (rank[rootv] > rank[rootu])
                    par[rootu] = rootv;
                else {
                    par[rootu] = rootv;
                    rank[rootv]++;
                }
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> acc) {
        int n = acc.size();
        disjoint ds = new disjoint(n);
        HashMap<String, Integer> map = new HashMap<>(); // for storing mail and tht array index

        for (int i = 0; i < n; i++) {
            // j starts from 1 because at 0 is name which we dont want
            for (int j = 1; j < acc.get(i).size();
                j++) { // j= acc.get(i).size() this because in first array get its size so tht it
                       // gets all its mails count
                String mail = acc.get(i).get(j);
                if (map.containsKey(mail))
                    ds.union(i, map.get(mail));
                else
                    map.put(mail, i);
            }
        }
        ArrayList<String>[] merge = new ArrayList[n];

        for (int i = 0; i <n; i++) {
            merge[i] = new ArrayList<>();
        }

        for (Map.Entry<String, Integer> it : map.entrySet()) {
            // for every pair in map get the mail and node then put it in merge
            String mail = it.getKey();
            int node = ds.find(it.getValue());
            merge[node].add(mail);
        }

        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // when nothing to merge go next
            if (merge[i].isEmpty())
                continue;

            Collections.sort(merge[i]);

            List<String> temp = new ArrayList<>();
            // get the name ==>get(0);
            temp.add(acc.get(i).get(0));

            // for evrything in merge add it to temp
            for (String it : merge[i]) {
                temp.add(it);
            }
            // go on adding lists to res
            res.add(temp);
        }
        return res;
    }
}
