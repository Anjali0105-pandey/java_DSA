class missing_no_in_array {
    public static void main(String[] args) {

        int array[]={1,2,4,7,6,5};
        int n=array.length;
        
        int sum1=((n+1)*(n+2))/2;
        int sum2=0;

        for(int j=0;j<array.length;j++){
            sum2+=j;
        }
        
        System.out.println(sum2);

        int res=0;
        res=sum1-sum2;
        
        System.out.println("The missing element is : "+res);
    }
}
