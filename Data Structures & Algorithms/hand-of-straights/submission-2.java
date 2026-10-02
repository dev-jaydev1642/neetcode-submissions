class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> cardCount = new TreeMap<>();

        for (int num : hand) cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);

        while (!cardCount.isEmpty()) {
            int firstCount = cardCount.firstKey();

            for (int i = 0; i < groupSize; i++) {
                int currCard = firstCount + i;
                if (!cardCount.containsKey(currCard)) return false;
                int cnt = cardCount.get(currCard);
                if (cnt == 1) cardCount.remove(currCard);
                else cardCount.put(currCard, cnt - 1);
            }
        }

        return true;
    }
}
