package com.kevin;

public class LeetCodeSolution {
    public int maxPathSumAnswer = Integer.MIN_VALUE;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        int totallength = length1 + length2;
        int left = -1, right = -1;
        int start1 = 0, start2 = 0;
        for (int i = 0; i <= totallength / 2; i++) {
            left = right;
            if (start1 < length1 && (start2 >= length2 || nums1[start1] < nums2[start2])) {
                right = nums1[start1++];
            } else {
                right = nums2[start2++];
            }
        }
        if ((totallength % 2) == 0)
            return (left + right) / 2.0;
        else
            return right;


    }

    public int maxPathSum(TreeNode node){
        int result = oneSideMax(node);
        return maxPathSumAnswer;
    }

    public int oneSideMax(TreeNode root){
        if(root == null)
            return 0;
        int left = Math.max(0,oneSideMax(root.left));
        int right = Math.max(0,oneSideMax(root.right));
        maxPathSumAnswer = Math.max(maxPathSumAnswer,left+right+root.val);
        return Math.max(left,right) + root.val;
    }



    //任意两数之和等于目标值
    public int[] twoSum(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){
            for(int j=i + 1;j<nums.length;j++){
                if(i + j == target){
                    return new int[]{i,j};
                }
            }

        }

        return null;
    }

    //打印所有子集-1
    public void allSubsets(int[] nums){
        int[] subnet = new int[nums.length];

        subsetHelper(nums, subnet,0);
    }

    //打印所有子集-2
    public void subsetHelper(int[] nums,int subset[],int index){
        if(index == nums.length)
        {
            printSubset(subset);
        }
        else{
            subset[index] = 0;
            subsetHelper(nums,subset,index + 1);
            subset[index] = nums[index];
            subsetHelper(nums,subset,index + 1);
        }
    }

    //打印所有子集-3
    public void printSubset(int[] subset){
        for(int i=0;i<subset.length;i++){
            System.out.print(subset[i] + ",");
        }
        System.out.println("");
    }

    //原地移除元素 Big-O(1)
    public int  removeElement(int[] nums, int val){
        int j = 0;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] == val){
                nums[i] = nums[j];
                j++;
            }
        }

        return nums.length;

    }

    //求X的平方根
    public int mySqrt(int x) {
        if(x == 0)
        {
            return 0;
        }

        long left =1;
        long right = x /2;
        while(left < right){
            long mid =(right + left) /2 + 1;
            if(mid > x /mid) {
                right = mid -1;
            }
            else{
                left = mid;
            }
        }
        return (int)left;
    }

    //旋转矩阵
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        //矩阵变形
        for(int i=0;i<len;i++){
            for(int j = i;j<len ;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        //反转每一行
        for(int i = 0;i<len;i++){
            for(int j =0;j<len/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = temp;
            }
        }

    }
}
