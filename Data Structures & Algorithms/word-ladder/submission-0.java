
        class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);

        if (!words.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        int steps = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int s = 0; s < size; s++) {
                String word = q.poll();

                if (word.equals(endWord)) return steps;

                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        arr[i] = ch;
                        String next = new String(arr);

                        if (words.contains(next)) {
                            q.offer(next);
                            words.remove(next);
                        }
                    }

                    arr[i] = old;
                }
            }

            steps++;
        }

        return 0;
    }
}
