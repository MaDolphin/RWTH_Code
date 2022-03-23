package test;
import _45_Jump_Game_II.*;
import algm.*;
import java.util.List;
public class Test {
    public static void main(String[] args){
        String str="[[\"[2,3,1,1,4]\"],[\"[2,3,0,1,4]\"]]";
        String[][] arr = Util.parseStringArrArr(str);
      
        for(int i=0;i<arr.length;i++){
            String[] unitArgs=arr[i];
            Solution s=new Solution();
            int[] arg0 = Util.parseIntegerArr(unitArgs[0]);
            int result=s.jump(arg0);
            String resultabc =Util.serializeInteger(result);
            System.out.print("resultabc"+Integer.toString(i)+":"+resultabc+"resultend");
        }
    }
}