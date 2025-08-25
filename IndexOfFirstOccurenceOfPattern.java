import java.util.Scanner;

public class IndexOfFirstOccurenceOfPattern{
    public static int solve(String text,String pat){
        return text.indexOf(pat);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        String pat=sc.next();
        int ans=solve(text,pat);
        System.out.println(ans);
    }
}