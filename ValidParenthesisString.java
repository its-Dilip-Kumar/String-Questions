import java.util.*;
public class  ValidParenthesisString {
    public static boolean checkValidString(String s){
        int n=s.length();
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                low++;
                high++;
            }else if(ch==')'){
                if(low>0) low--;
                high--;
            }else{
                if(low>0) low--;
                high++;
            }
            if(high<0) return false;
        }
        return low==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(checkValidString(s)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
