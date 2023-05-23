//Approach : Bubble Sort
//Time Complexity : O(n^2)
//Space Complexity : O(1)
//Inplace and stable sorting algorithm
//Comparison based sorting algorithm

class bubble_sort{
    public static void bubbleSort(int arr[]){
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //for every iteration we get biggest element at last no comparison for that
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,21,13,24,45,67,82,56};
        int n=arr.length;

        //function call
        bubbleSort(arr);
        System.out.println("Sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}