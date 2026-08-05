class Solution {
    public int ladderLength(String start, String end, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();

        if (!set.contains(end))
            return 0;

        q.add(start);
        int count = 1;

        while (!q.isEmpty()) {
            int s = q.size();

            for (int i = 0; i < s; i++) {
                String word = q.poll();
if(word.equals(end))return count;
                char[] w = word.toCharArray();
                for (int j= 0; j < w.length; j++) {
                    char old = w[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        w[j]=c;
                        String nxt = new String(w);
                        if (set.contains(nxt)) {
                            q.add(nxt);
                            set.remove(nxt);
                        }
                    } 
                    w[j] = old;
                }
            }
            count++;
        }
        return 0;
    }
}
