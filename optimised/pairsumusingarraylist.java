public static boolean pair(ArrayList<Integer>list,int target){
        int bp=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp)==target)){
            return true;
        }
        else if((list.get(lp)+list.get(rp)>target)){
            rp=(list.size()+rp-1)%list.size();
        }
        else{
            lp=(lp+1)%list.size();
        }
            
        }
        
        return false;
    }
}// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        find("abc","",0);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(pair(list,100));}
