public class Excel_Column {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result=result*26+(columnTitle.charAt(i)-64);
        }
        return result;
    }
}
