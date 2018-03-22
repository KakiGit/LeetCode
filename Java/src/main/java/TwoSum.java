import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 */
public class TwoSum {

    public static void selfTest() {
        int [] testArray = {2,7,11,15};
        int target = 9;
        long startTime = System.nanoTime();//获取当前时间
        
        twoSumAnother(testArray, target);
        //doSomeThing();   //要运行的java程序
        long endTime = System.nanoTime();
        System.out.println("程序运行时间：" + (endTime - startTime)/1000 + "us");
    }

    public static int[] twoSumAnother(int[] nums, int target) {
        int complement;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            complement = target - nums[i];
            if(map.containsKey(complement))
            {
            // System.out.println(Arrays.toStr/ing(new int[] { i, map.get(complement) }) );
            return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        ArrayList<Integer> ts = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    ts.add(i);
                    ts.add(j);
                    System.out.println(Arrays.toString(new int[] { i, j }) );
                    return new int[] {i,j};
                }
            }
        }    
        
        throw new IllegalArgumentException("No two sum solution");
    }
}