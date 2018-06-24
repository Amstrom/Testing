public class BreakingtheRecords {

    static int[] breakingRecords(int[] scores) {
        int cMax=0,cMin=0,max,min;
        max=scores[0];
        min=scores[0];
        for (int x:scores)
        {
            if(max<x)
            {
                max=x;
                cMax++;
            }
            else if(min>x)
            {
                min=x;
                cMin++;
            }
        }
        int arr[]={cMax,cMin};
        return arr;

    }

    public static void main(String[] args) {

    }
}
