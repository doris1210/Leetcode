package leetcode;

public class l209_最短连续子数组求和大于某个值 {
    //O(n*n*n)复杂度
//    public static int minSubArrayLen(int s, int[] nums) {
////       [2,3,1,2,4,3] and s = 7,
////        [4,3]
//        int i=0,j=0,k=0;
//        int lens = nums.length;
//        int curlens = 0;
//        int minlen = lens;
//        int sum = 0;
//            for(;i<lens;i++){
//                j=i;
//                for(;j<lens;j++){
//                    for(k=i;k<=j;k++) {
//                        sum += nums[k];
//                    }
//                    if(sum>=s){
//                        sum=0;
//                        curlens = j-i+1;
//                        if(curlens < minlen){
//                            minlen=curlens;
//                            break;
//                        }
//                    }else if(sum<s && j-i+1 == lens){
//                        minlen = 0;
//                    }
//                    sum=0;
//                }
//            }
//            return minlen;
//
//        }
    public static int minSubArrayLen(int s,int[] nums){

    }
    public static void main(String[] args) {
        int s = 15;
        int[] nums={5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(s,nums));
    }
}
