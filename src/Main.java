import java.util.*;

class Solution{
    public boolean FindTarget(int[] nums, int target){
        Set<Integer> appeared = new HashSet<>();
        for(int num:nums ){
            if (appeared.contains(target-num)){
                return true;
            }else {
                appeared.add(num);
            }

        }return false;
    }
}


public class Main {

    public static void main(String[] args){
        Solution solution =new Solution();
        System.out.println(solution.FindTarget(new int[]{4,5,7,10},12));
        System.out.println(solution.FindTarget(new int[]{4,5,7,10},8));
        System.out.println(solution.FindTarget(new int[]{4,4,7,10},8));

    }
}
