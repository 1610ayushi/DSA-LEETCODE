/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j< nums2.length)
            if(nums1[i]<nums2[j])i++;
        else if(nums1[i]>nums2[j])j++;
        else{
            nums1[k++]=nums1[i];
            ++i; ++j ;
        }
        int ans[] = new int[k];
        for(i=0;i<k;i++){
            ans[i]=nums1[i];
        }
        return ans;
    }
}
