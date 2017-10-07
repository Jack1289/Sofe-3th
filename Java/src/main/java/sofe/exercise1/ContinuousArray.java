package sofe.exercise1;
        
import java.util.ArrayList;

public class ContinuousArray {

    public static boolean isAlmostIncreasingSequence(int[] sequence) {
        ArrayList<Integer> temporalList=new ArrayList<Integer>();
        boolean flag;
                
        for (int i = 0; i < sequence.length; i++) {
            if(i != sequence.length-1){
                if(sequence[i] < sequence[i+1]){
                    temporalList.add(sequence[i]);
                }
            }else {
            temporalList.add(sequence[i]);
            }
               
        }
        /* for (int i : sequence) {
        //if(i != sequence.length-1){
        if(sequence[i] < sequence[i+1]){
        temporalList.add(sequence[i]);
        }
        //}
        
        }*/
        if(temporalList.size() == sequence.length-1 || temporalList.size() == sequence.length){ 
            flag = true; }
        else{flag = false;}
        return flag;
    }

}
