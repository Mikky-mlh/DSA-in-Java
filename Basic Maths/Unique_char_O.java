public class Unique_char_O {
    public int firstUniqChar(String str) {
    int[] occ= new int[199];
        for(int i=0; i < str.length(); i++){
            occ[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(occ[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}