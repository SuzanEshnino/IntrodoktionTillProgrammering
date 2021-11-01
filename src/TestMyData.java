
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMyData {

    @Test
    public void testNumberOfWords() {

        String data = "Suzan Worlds";
        MyDatacounting words = new MyDatacounting();
        words.addWords(data);
        int actual = words.getNumOfWords();
        int expected = 2;
        assertEquals(expected, actual);


    }


    @Test
    public void testNumberOfCharacters() {

        String data = "Suzan Worlds is here";
        MyDatacounting words = new MyDatacounting();
        words.addlength(data);
        int actual = words.getLength();
        int expected = 17;
        assertEquals(expected, actual);


    }

    @Test
    public void testTheLongestWord() {

        String data = "Suzanaaa Worlds kan be here";
        MyDatacounting words = new MyDatacounting();
        words.checkLongWord(data);
        String actual = words.getLongestWord();
        String expected = "Suzanaaa";
        assertEquals(expected, actual);


    }

    @Test
    public void testNumberOfWordsBeforeStop() {

        String data = "Suzanaaa Worlds stop kan be here";
        MyDatacounting words = new MyDatacounting();
        words.addWords(data);
        int actual = words.getNumOfWords();
        int expected = 2;
        assertEquals(expected, actual);


    }

    @Test
    public void testLongestWordBeforeStop() {

        String data = "Suzanaaa Worlds stop suzanaaaaaa jag";
        MyDatacounting words = new MyDatacounting();
        words.checkLongWord(data);
        String actual = words.getLongestWord();
        String expected = "Suzanaaa";
        assertEquals(expected, actual);


    }

    @Test

    public void testNumberOfLines() {

        String data = "Suzan";
        MyDatacounting words = new MyDatacounting();
        words.addLines(data);
        int actual = words.getLines();
        int expected = 1;
        assertEquals(expected, actual);


    }

    @Test

    public void testEmptyLines() {

        String data = "";
        MyDatacounting words = new MyDatacounting();
        words.addLines(data);
        int actual = words.getLines();
        int expected = 0;
        assertEquals(expected, actual);


    }


}

