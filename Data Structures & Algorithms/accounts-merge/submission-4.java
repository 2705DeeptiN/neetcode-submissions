class Solution {
    class disjoint {
        int[] par;
        int[] rank;
        disjoint(int n) {
            par = new int[n];
            rank = new int[n];

            for(int i=0;i<n;i++){
                par[i]=i;
            }
        }

        int find(int i) {
            if (par[i] != i)
                par[i] = find(par[i]);
            return par[i];
        }

        void union(int u, int v) {
            int rootu = find(u);
            int rootv = find(v);

            if (rootu != rootv) {
                if (rank[rootu] < rank[rootv])
                    par[rootu] = rootv;
                else if (rank[rootu] > rank[rootv])
                    par[rootv] = rootu;
                else{
                    par[rootu] = rootv;
                    rank[rootv]++;
            }}
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> acc) {
        int n = acc.size();
        disjoint ds = new disjoint(n);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < acc.get(i).size(); j++) {
                String mail = acc.get(i).get(j);
                if (map.containsKey(mail)) {
                    ds.union(i, map.get(mail));
                }
                map.put(mail, i);
            }
        }
        ArrayList<String>[] merge = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            merge[i] = new ArrayList<>();
        }

        for (Map.Entry<String, Integer> it : map.entrySet()) {
            String mail = it.getKey();
            int node = ds.find(it.getValue());
            merge[node].add(mail);
        }

        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (merge[i].isEmpty())
                continue;

            List<String> temp = new ArrayList<>();
            Collections.sort(merge[i]);

            temp.add(acc.get(i).get(0));

            for (String s : merge[i]) {
                temp.add(s);
            }

            res.add(temp);
        }
        return res;
    }
}