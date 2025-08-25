import java.util.Scanner;
public class LongestPrefixSuffix {
    public static int solve(String text){
        int[] lps=new int[text.length()];
        int pre=0;
        int suff=1;
        while(suff<text.length()){
            if(text.charAt(pre)==text.charAt(suff)){
                pre++;
                lps[suff]=pre;
                suff++;
            }else if(pre==0){
                lps[suff]=0;
                suff++;
            }else{
                pre=lps[pre-1];
            }
        }
        return lps[text.length()-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String haystack=sc.nextLine();
        int ans=solve(haystack);
        System.out.println(ans);
    }
    
}
