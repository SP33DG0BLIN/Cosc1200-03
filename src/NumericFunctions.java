//bhavin shuseevan 
//inft 
//activity 2

public class NumericFunctions{
    public static boolean isEven(int val) {
        return val % 2==0;

    }
    public static boolean isPos(int val){
        return val > 0;
    }
    public static boolean isFib(int val) {
        if (val ==1|| val == 0)return true;
        int a = 0;
        int b = 1;
        while (b < val) {
            int temp = b;
            b = a + b;
            a = temp;
        }
    
    return b == val;
    }
    public static boolean isPOtwo(int val)
    {
        if (val <=0)return false;
        return(val & (val - 1)) ==0;
    }
    public static boolean isPrm(int val) {
        if (val <=1) return false;
        for (int i = 2;i< Math.sqrt(val);i++){

        }
        return true;
    }
    public static boolean isSqr(int val) {
        int sqrt = (int) Math.sqrt(val);
        return sqrt * sqrt == val;
    }
    
}