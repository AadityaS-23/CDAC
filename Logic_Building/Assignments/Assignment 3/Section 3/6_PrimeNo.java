public class Program6 {
    public static void main(String[] args) {
        
        int num =15;
        int i = 2;
        while(num > 0) {
            int count = 0;
            for(int j=2; j<=i; j++) {  
                if(i%j == 0) {
                    count++;
                    if(count > 1) {
                        break;
                    }
                }
            }
            if(count == 1){
                System.out.println(i+" ");
                num--;
            }
            i++;
        }
    }
    
}