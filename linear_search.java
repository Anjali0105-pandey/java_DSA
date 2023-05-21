import java.util.*;

class linear_search {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the size of array : \n");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("\nEnter the elements of array : \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
         // target element from the user
         System.out.println("Enter target element");
         int x = sc.nextInt();

        // Implementation of linear search
        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Searched element is not found in an array");
        }
        else{
            System.out.println("Searched element is found at the location:" +idx);
        }
    }
}
