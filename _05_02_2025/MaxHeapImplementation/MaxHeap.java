import java.util.Arrays;

public class MaxHeap {
    
    public final int[] heap;
    final int maxSize;
    public int size;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[maxSize];
        heap[0] = Integer.MAX_VALUE;
    }

    public MaxHeap(int[] arr, int maxSize) {
        this.maxSize = maxSize;
        this.size = arr.length;
        heap = new int[maxSize];
        System.arraycopy(arr, 0, heap, 0, size);
        buildHeap(); // Ensure the array is converted into a max heap
    }

    private int getParentPos(int pos) {
        return (pos - 1)/2 >= 0 ? (pos - 1)/2 : -1;
    }

    private int getLeftChildPos(int pos) {
        return (2 * pos + 1) < size ? (2 * pos + 1) : -1;
    }

    private int getRightChildPos(int pos) {
        return (2 * pos + 2) < size ? (2 * pos + 2) : -1;
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    private void heapifyDown(int pos) {
        int largest = pos;
        int leftChild = getLeftChildPos(pos);
        int rightChild = getRightChildPos(pos);

        if (leftChild != -1 && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        if (rightChild != -1 && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if (largest != pos) {
            swap(heap, pos, largest);
            heapifyDown(largest);
        }
    }

    private void heapifyUp(int pos) {
        int parentPos = getParentPos(pos);
        if (parentPos != -1 && heap[parentPos] < heap[pos]) {
            swap(heap, parentPos, pos);
            heapifyUp(parentPos);
        }
    }

    private void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    public int extractMax(){
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public void insert(int elem) {
        if(size == maxSize) {
            System.out.println("Heap is Full !!");
            return;
        }

        heap[size] = elem;
        heapifyUp(size);
        size++;
    }

    public int delete() {
        return extractMax();
    }

    public void displayHeap(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(heap, 0, size)));
    }

    public static void heapSort(int[] array) {
        MaxHeap maxHeap = new MaxHeap(array, array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = maxHeap.extractMax();
        }
    }
}