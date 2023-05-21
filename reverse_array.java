
class reverse_array {
    public static void main(String[] args) {
        int[] array={1,3,5,8,10};
        int n=array.length;
        System.out.println("Original array : ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
        
        System.out.println("\nReversal of array : ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }    
}
