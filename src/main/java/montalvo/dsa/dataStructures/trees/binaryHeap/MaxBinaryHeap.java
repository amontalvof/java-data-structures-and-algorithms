package montalvo.dsa.dataStructures.trees.binaryHeap;

import java.util.ArrayList;
import java.util.List;

public class MaxBinaryHeap<T extends Number> {
    private List<T> values;

    public MaxBinaryHeap() {
        this.values = new ArrayList<T>();
    }

    public T extractMax() {
        if (this.values.size() > 0) {
            T max = this.values.get(0);
            T end = this.values.remove(this.values.size() - 1);
            if (this.values.size() >= 1) {
                this.values.set(0, end);
                this.sinkDown();
            }
            return max;
        }
        return null;
    }

    private void sinkDown() {
        int idx = 0;
        int length = this.values.size();
        T element = this.values.get(0);

        while (true) {
            int leftChildIdx = 2 * idx + 1;
            int rightChildIdx = 2 * idx + 2;
            T leftChild, rightChild;
            int swap = 0;

            if (leftChildIdx < length) {
                leftChild = this.values.get(leftChildIdx);
                if (leftChild.doubleValue() > element.doubleValue()) {
                    swap = leftChildIdx;
                }
            }

            if (rightChildIdx < length) {
                rightChild = this.values.get(rightChildIdx);
                leftChild = this.values.get(leftChildIdx);
                if ((swap == 0 && rightChild.doubleValue() > element.doubleValue()) ||
                        (swap != 0 && rightChild.doubleValue() > leftChild.doubleValue())) {
                    swap = rightChildIdx;
                }
            }

            if (swap == 0) {
                break;
            }

            this.values.set(idx, this.values.get(swap));
            this.values.set(swap, element);
            idx = swap;
        }
    }

    public MaxBinaryHeap<T> insert(T value) {
        this.values.add(value);
        this.bubbleUp();
        return this;
    }

    private void bubbleUp() {
        int idx = this.values.size() - 1;
        T element = this.values.get(idx);
        while (idx > 0) {
            int parentIndex = (idx - 1) / 2;
            T parent = this.values.get(parentIndex);
            if (element.doubleValue() <= parent.doubleValue()) {
                break;
            }
            this.values.set(parentIndex, element);
            this.values.set(idx, parent);
            idx = parentIndex;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " values='" + getValues() + "'" +
                "}";
    }

    public List<T> getValues() {
        return this.values;
    }

}
