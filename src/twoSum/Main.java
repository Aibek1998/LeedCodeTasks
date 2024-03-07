package twoSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] nums = {4, 9, 8, 2, 6, 11, 7, 5};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Index :  " + i + "+" + j);
                    System.out.println("Elements :  " + nums[i] + "+" + nums[j]);
                }
            }
        }
    }
}