public class PalindromeNonStatic {
    public boolean palindrome(int x){
        if(x<0) return false;
        int n=x, revNum = 0;
        while(n>0){
            revNum = revNum*10 + (n%10);
            n/=10;
        }
        return revNum == x;
    }
    public static void main(String[] args){
        // create an object in the main method
        PalindromeNonStatic obj = new PalindromeNonStatic();
        System.out.println(obj.palindrome(232));
    }
}
