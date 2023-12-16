public class SelectionMain {

    public static void main(String[] args) {


        int nums[]={3,5,4,2,1};



        int i=0;
        while(i<nums.length){

            int maxIndex = -1;
            int maxValue=Integer.MIN_VALUE;
            for(int j=0;j<nums.length-i;j++){

                if(maxValue < nums[j]){
                    maxValue=nums[j];
                    maxIndex=j;
                    System.out.println("i = "+i +" max value "+maxValue+" max index "+maxIndex);
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;

            i++;
        }
        System.out.println("selection sort");
        for(int num : nums){
            System.out.println(num);
        }
    }
}
