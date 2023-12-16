public class MatrixMain {

    public static void main(String[] args) {


    int mat[][]={{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
    process(mat);

    }





    public <T> T calculate(T name){

        return name;
    }

    public <L> L sum(L name){

        return name;
    }

    public <Q> void divide(Q name){

    }

    static <Z> void lion(Z name){

    }

    static void process(int[][] mat){

        int target=291;

        int r=0,c=mat[0].length-1;
        int result[]={-1,-1};

        while(r< mat.length && c >=0){
            if(mat[r][c] == target){
                result[0]=r;
                result[1]=c;
                break;
            }
            if(mat[r][c] > target){
                c--;
            }
            if(mat[r][c] < target){
                r++;
            }
        }
        //System.out.println("result "+result);
        System.out.println("result");
        System.out.println("[" + result[0]+","+result[1]+"]");
    }
}
