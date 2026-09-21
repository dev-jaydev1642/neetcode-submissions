class Solution {
    private int[] heap;
    private int size;
    private int k;

    public int findKthLargest(int[] nums, int k) {
        this.k = k;
        this.heap = new int[k];
        this.size = 0;

        for (int num : nums) {
            add(num);
        }

        return heap[0];
    }

    private void add(int val) {
        if (size < k) {
            heap[size] = val;
            size++;
            heapifyUp(size - 1);
        } else if (val > heap[0]) {
            heap[0] = val;
            heapifyDown(0);
        }
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap[parent] <= heap[index]) break;
            swap(index, parent);
            index = parent;
        }
    }

    private void heapifyDown(int index) {
        while (index * 2 + 1 < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int smallest = leftChild;

            if (rightChild < size && heap[rightChild] <= heap[leftChild]) smallest = rightChild;
            if (heap[index] <= heap[smallest]) break;
            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
