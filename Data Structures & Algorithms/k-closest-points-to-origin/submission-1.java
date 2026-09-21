class Solution {
    private int[][] heap;
    private int size;
    private int k;

    public int[][] kClosest(int[][] points, int k) {
        this.k = k;
        this.heap = new int[k][2];
        this.size = 0;

        for (int[] point : points) add(point);    

        return heap;
    }

    private void add(int[] point) {
        int currDistance = getSquaredDistance(point);
        if (size < k) {
            heap[size] = point;
            size++;
            heapifyUp(size - 1);
        } else if (currDistance < getSquaredDistance(heap[0])) {
            heap[0] = point;
            heapifyDown(0);
        }
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (getSquaredDistance(heap[parent]) >= getSquaredDistance(heap[index])) break;
            swap(index, parent);
            index = parent;
        } 
    }

    private void heapifyDown(int index) {
        while (index * 2 + 1 < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int largest = leftChild;

            if (rightChild < size && getSquaredDistance(heap[rightChild]) > getSquaredDistance(heap[leftChild])) largest = rightChild;
            if (getSquaredDistance(heap[index]) >= getSquaredDistance(heap[largest])) break;
            swap(index, largest);
            index = largest;
        }
    }

    private int getSquaredDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    private void swap(int i, int j) {
        int[] temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
