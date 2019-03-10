package algorithm;

public class Sort {

    long executionTime = 0;
    private int[] list;
    /*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        int n=array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return list;
    }

        
        


    public int [] mergeSort(int [] array, int l, int r){
        int [] list = array;

        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array , m+1, r);
            merge(array, l, m, r);
        }
        
        

        return list;
    }

    private void merge(int[] array, int l, int m, int r) {
        {
            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int [n1];
            int R[] = new int [n2];


            for (int i=0; i<n1; ++i)
                L[i] = array[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = array[m + 1+ j];

            int i = 0, j = 0;

            int k = l;
            while (i < n1 && j < n2)
            {
                if (L[i] <= R[j])
                {
                    array[k] = L[i];
                    i++;
                }
                else
                {
                    array[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1)
            {
                array[k] = L[i];
                i++;
                k++;
            }
            while (j < n2)
            {
                array[k] = R[j];
                j++;
                k++;
            }
        }
        
    }


    public int [] quickSort(int[] array, int low, int high) {
        {
            int pivot = array[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

        }
        return list;
    }
    
   // public int [] heapSort(int [] array,) {}


        public int [] bucketSort(int [] array, int max_value){


            int[] Bucket = new int[max_value + 1];
            int[] sorted_nums = new int[array.length];
            for (int i = 0; i < array.length; i++)
                Bucket[array[i]]++;
            int outPos = 0;
            for (int i = 0; i < Bucket.length; i++)
                for (int j = 0; j < Bucket[i]; j++)
                    sorted_nums[outPos++] = i;
            return sorted_nums;
        }
        
        


    
    public int [] shellSort(int [] array){
        int [] list = array;

        //implement here
        int n = array.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
