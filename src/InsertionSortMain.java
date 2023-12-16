public class InsertionSortMain {

    public static void main(String[] args) {

        int nums[]={13,15,40,2,1};

        int i=0;

        while(i<nums.length-1){

            int j=i+1;
            while(j>0){

                if(nums[j] < nums[j-1]){
                    int t=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=t;
                }
                else{
                    break;
                }
                j--;
            }

            i++;
        }

        System.out.println("insertion sort");
        for(int num : nums){
            System.out.println(num);
        }

    }
}
