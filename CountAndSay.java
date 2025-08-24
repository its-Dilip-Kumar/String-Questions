import java.util.*;
public class CountAndSay {
    public static String solve(int n){
        if(n==1) return "1";
        String say=solve(n-1);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<say.length();i++){
            char ch=say.charAt(i);
            int count=1;
            while(i<say.length()-1 && say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=solve(n);
        System.out.println(ans);
    }
}
