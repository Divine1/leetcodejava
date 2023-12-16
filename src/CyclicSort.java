import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int nums[]={3,5,2,6,1,4};


        int i=0;
        while(i<nums.length){


            if(i == nums[i]-1){
                i++;
            }
            else{
                int diff = nums[i] - 1;
                int t = nums[diff];
                nums[diff] = nums[i];
                nums[i]=t;
            }
        }
        System.out.println("cyclic sort");
        System.out.println(Arrays.toString(nums));
    }
}
