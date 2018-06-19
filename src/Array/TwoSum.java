package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 示例:
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 * Created by Mosen on 2018/4/24.
 */
public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("找出数组中和为目标值的两个数");
        System.out.println("给定整数数组，以逗号分隔");
        String array = scanner.nextLine();
        String[] numsStr = array.split(",");
        int[] nums = new int[numsStr.length];
        for (int i=0; i<numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i].trim());
        }
        System.out.println("给定目标值");
        int sum = scanner.nextInt();
        List<Integer> index = TwoIndex(nums, sum);
        System.out.println("满足要求的下标为");
        System.out.println(index);
    }

    private static List<Integer> TwoIndex(int[] nums, int sum) {
        List<Integer> list = new ArrayList<>();
        int num1, num2;
        for (int i=0; i<nums.length; i++) {
            num1 = nums[i];
            for (int j=1; j<nums.length-i; j++) {
                num2 = nums[j];
                if (num1+num2 == sum) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }


}
