class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char ch : tasks) freq[ch - 'A']++;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int f : freq) {
            if (f > 0)
                pq.offer(f);
        }

        int time = 0;

        while (!pq.isEmpty()) {
            int cycle = n + 1;
            List<Integer> temp = new ArrayList<>();

            while (cycle > 0 && !pq.isEmpty()) {
                int f = pq.poll();

                if (f - 1 > 0)
                    temp.add(f - 1);

                time++;
                cycle--;
            }

            for (int f : temp) pq.offer(f);

            if (!pq.isEmpty())
                time += cycle;
        }

        return time;
    }
}