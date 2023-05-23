//Time Complexity : O(n^2) worst case
//Time Complexity : O(n) best case
//Space Complexity : O(1)
//Inplace and stable sorting algorithm
//Comparison based sorting algorithm


class insertion_sort {
    //Implementation
    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;        
                
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,34,19,45,-21,-55,23,55};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
