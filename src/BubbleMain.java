public class BubbleMain {

    public static void main(String[] args) {
        int nums[]={13,15,40,2,1};


        int i=0;
        while(i<nums.length){

            for(int j=1;j<nums.length -i;j++){
                if(nums[j]<nums[j-1]){
                    int t = nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=t;
                }
            }
            i++;
        }

        for(int num : nums){
            System.out.println(num);
        }
    }
}
