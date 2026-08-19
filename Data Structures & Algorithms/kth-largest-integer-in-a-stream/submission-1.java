class KthLargest {
    private final int k;
    private final int[] heap;
    private int size;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new int[k];
        this.size = 0;
        
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if (size < k) {
            heap[size] = val;
            size++;
            heapifyUp(size - 1);
        } else if (val > heap[0]) {
            heap[0] = val;
            heapifyDown(0);
        }

        return heap[0];
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] >= heap[parentIndex]) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        while (index * 2 + 1 < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int smallest = leftChild;

            if (rightChild < size && heap[rightChild] < heap[leftChild]) {
                smallest = rightChild;
            } 

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
