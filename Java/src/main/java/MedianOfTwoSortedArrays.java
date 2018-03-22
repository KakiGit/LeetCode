/**
 * MedianOfTwoSortedArrays
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;
        double sizeA1=nums1.length,sizeA2=nums2.length;
        if((sizeA1+sizeA2)%2==0)
        result = nums1[1];
        return result;
    }
}