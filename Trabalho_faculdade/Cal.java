public class Cal{
    public static float Sum(float a,float b){
        return a+b;
    }
    public static float Sub(float a,float b){
        return a-b;
    }
    public static float Mult(float a,float b){
        return a*b;
    }
    public static float Div(float a,float b){
        if (a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }
}