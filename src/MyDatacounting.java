
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Arrays;

public class MyDatacounting {

    private String myData = " ";
    private int Length = 0;
    private int l = 0;
    private int lines = 0;
    private int count = 0;
    private int numOfWords = 0;
    private String longestWord = "";

    public MyDatacounting() {

    }

    public void addlength(String data) {
        myData = data;
        String[] ary = myData.split("\\s+");
        for (int i = 0; i < ary.length; i++) {
            if (!ary[i].equals("stop")) {
                l = Length + ary[i].length();
                Length = l;
            }
            else {
                break;
            }
        }
    }


    public void checkLongWord(String data) {
        myData = data;

        String[] listOfWords = myData.split("\\s+");
        for (int i = 0; i < listOfWords.length; i++) {
            if (!listOfWords[i].equals("stop")) {
                if (longestWord.length() < listOfWords[i].length()) {
                    longestWord = listOfWords[i];
                }


            }
            else {
                break;
            }
        }

    }

    public void addLines(String data) {
        myData = data;
        if (!myData.equals(null) && !myData.equals("")) {
            lines = count + 1;
            count = lines;
        }
    }

    public void addWords(String data) {

        myData = data;
        String[] ary = myData.split("\\s+");
        for (int i = 0; i < ary.length; i++) {
            if (!ary[i].equals("stop")) {
                numOfWords = numOfWords + 1;

            } else {
                break;
            }
        }

    }


    public String getData() {

        return myData;
    }


    public int getLength() {

        return Length;
    }

    public int getLines() {

        return count;
    }

    public int getNumOfWords() {
        return numOfWords;
    }

    public String getLongestWord() {
        return longestWord;
    }


    public boolean hasStop( String data){
        myData=data;
        if(myData.contains("stop")){
            return true;
        }
        return false;


    }
}






