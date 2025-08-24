import java.util.*;
public class MinimumNumberOfBracketReversalApproach2 {
    public static int solve(String s){
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else if(open!=0) open--;
            else close++;
        }
        return open+close;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(solve(str));
    }
}
