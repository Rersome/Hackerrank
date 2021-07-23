package Zadachki;

import java.util.Arrays;

public class anotherArray {
    public static void main(String[] args){
        int array[] = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(Arrays.toString(removeElement(array, 2)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
                System.out.println(i + ", " + offset);
            } else {
                nums[i - offset] = nums[i];
                //System.out.println(i + ", " + offset);
            }
        }
        return Arrays.copyOf(nums, nums.length);
    }
}
