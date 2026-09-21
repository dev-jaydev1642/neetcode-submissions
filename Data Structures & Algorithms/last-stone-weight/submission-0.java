class Solution {
    private int[] heap;
    private int size;

    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        this.heap = new int[n];
        this.size = 0;

        for (int stone : stones) {
            add(stone);
        }

        while (size > 1) {
            int y = poll();
            int x = poll();

            if (x != y) {
                add(y - x);
            }
        }
        
        return size == 0 ? 0 : heap[0];
    }

    private void add(int val) {
        heap[size] = val;
        size++;
        heapifyUp(size - 1);
    }

    private int poll() {
        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return maxValue;
    } 

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[parentIndex] >= heap[index]) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        while (index * 2 + 1 < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int largest = leftChild;

            if (rightChild < size && heap[rightChild] > heap[leftChild]) largest = rightChild;
            if (heap[index] >= heap[largest]) break;
            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
