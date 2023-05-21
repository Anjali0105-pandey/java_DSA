import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the size of array.\n");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("\nEnter the elements of array.\n");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        /*System.out.println("\nElements of array are :\n");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }*/

        int flag=0;
        for(int i=0;i<size/2;i++){
            if(arr[i]!=arr[size-i-1]){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("\n Not a palindrome.\n");
        }
        else{
            System.out.println("\n Palindrome.\n");
        }
    }
}