//! Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.

public class Watermelon{
    public String Watermelon(int w){
        if(w > 2 && w%2==0){
            return "YES";
        } else {
            return "NO";
        }
    }
}