import javax.sound.midi.Soundbank;


class duplicate_elem {
        public static void main(String[] args) {
            int array[]={2,4,4,7,7,10};
            System.out.println("Duplicate elements :");
            for (int i = 0; i < array.length; i++) {
                for (int j =i+1; j < array.length; j++) {
                    
                    if(array[i]==array[j]){
                        
                        System.out.print(array[i]+", ");
                    }
                }
            }
        }
}
