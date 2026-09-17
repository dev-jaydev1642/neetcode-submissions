class Solution {
    static class Node {
        List<Integer> currList;
        int currSum;
        int startIndex;
    
        Node(List<Integer> currList, int currSum, int startIndex) {
            this.currList = new ArrayList<>(currList);
            this.currSum = currSum;
            this.startIndex = startIndex;
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(new ArrayList<>(), 0, 0));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr.currSum == target) {
                result.add(curr.currList);
                continue;
            }

            for (int i = curr.startIndex; i < nums.length; i++) {
                int nextSum = curr.currSum + nums[i];
                if (nextSum <= target) {
                    List<Integer> nextList = new ArrayList<>(curr.currList);
                    nextList.add(nums[i]);
                    queue.add(new Node(nextList, nextSum, i));
                }
            }
        }
        return result;
    }

    
}
