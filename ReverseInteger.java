class ReverseInteger {
    public int reverse(int x) {
            int sum=0;
            while (x != 0){
            int temp = x % 10;
            sum = sum*10 + temp;
            x = x/10;      
        }
         System.out.println (" " + sum);
            return sum;
        
        }
}