import java.util.Arrays;

class transpose_matrix {
    static void trans_mat(int arr[][]){

        //Step 1: Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //Step 2 : Swap left and right side elements
        for (int i = 0; i < arr.length; i++) {
            int li=0;
            int ri=arr.length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        trans_mat(arr);
        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
