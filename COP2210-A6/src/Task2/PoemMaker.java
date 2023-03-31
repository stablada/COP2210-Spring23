package Task2;

import java.util.StringTokenizer;

public class PoemMaker {
    String[] s;
    public void poemize() {
        for (String print : s) {
            System.out.println(print);
        }
        System.out.println("");
    }

    public int countWords() {
        return s.length;
    }
    public PoemMaker(String str) {
        StringTokenizer st = new StringTokenizer(str);
        s = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()){
            s[i] = st.nextToken();
            i++;
        }
    }
}
