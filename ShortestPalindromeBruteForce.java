import java.util.*;
public class ShortestPalindromeBruteForce {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String solve(String s){
        int n=s.length();
        int end=n-1;
        while(end>=0){
            if(isPalindrome(s.substring(0,end+1))) break;
            end--;
        }
        String suff=s.substring(end+1);
        StringBuilder sb=new StringBuilder(suff).reverse();
        return sb.append(s).toString();
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     String ans=solve(s);
     System.out.println(ans);
    }
}
