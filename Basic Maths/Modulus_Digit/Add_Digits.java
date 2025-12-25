public class Add_Digits {
    public int addDigits(int num) {
        //! Add digits of a number
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        else{
            return num%9; //* Every number's reminder is the sum of digits of the number
        }
    }
}
