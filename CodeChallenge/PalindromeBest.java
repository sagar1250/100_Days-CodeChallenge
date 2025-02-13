public class PalindromeBest {
    public static boolean palindrome(int x){
        if(x<0) return false;
        int n=x, revNum=0;
        while(n>0){
            revNum = revNum*10 + (n%10);
            n/=10;
        }
        return revNum == x;
    }
    public static void main(String[] args){
        System.out.println(palindrome(121));
    }
}
