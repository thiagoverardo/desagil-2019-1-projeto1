// Não é permitido mudar nada neste arquivo.

package br.pro.hashi.ensino.desagil.projeto1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TranslatorTest {
    private Translator translator;

    @Before
    public void setUp() {
        translator = new Translator();
    }

    @Test
    public void toA() {
        Assert.assertEquals('A', translator.morseToChar(".-"));
    }

    @Test
    public void toB() {
        Assert.assertEquals('B', translator.morseToChar("-..."));
    }

    @Test
    public void toC() {
        Assert.assertEquals('C', translator.morseToChar("-.-."));
    }

    @Test
    public void toD() {
        Assert.assertEquals('D', translator.morseToChar("-.."));
    }

    @Test
    public void toE() {
        Assert.assertEquals('E', translator.morseToChar("."));
    }

    @Test
    public void toF() {
        Assert.assertEquals('F', translator.morseToChar("..-."));
    }

    @Test
    public void toG() {
        Assert.assertEquals('G', translator.morseToChar("--."));
    }

    @Test
    public void toH() {
        Assert.assertEquals('H', translator.morseToChar("...."));
    }

    @Test
    public void toI() {
        Assert.assertEquals('I', translator.morseToChar(".."));
    }

    @Test
    public void toJ() {
        Assert.assertEquals('J', translator.morseToChar(".---"));
    }

    @Test
    public void toK() {
        Assert.assertEquals('K', translator.morseToChar("-.-"));
    }

    @Test
    public void toL() {
        Assert.assertEquals('L', translator.morseToChar(".-.."));
    }

    @Test
    public void toM() {
        Assert.assertEquals('M', translator.morseToChar("--"));
    }

    @Test
    public void toN() {
        Assert.assertEquals('N', translator.morseToChar("-."));
    }

    @Test
    public void toO() {
        Assert.assertEquals('O', translator.morseToChar("---"));
    }

    @Test
    public void toP() {
        Assert.assertEquals('P', translator.morseToChar(".--."));
    }

    @Test
    public void toQ() {
        Assert.assertEquals('Q', translator.morseToChar("--.-"));
    }

    @Test
    public void toR() {
        Assert.assertEquals('R', translator.morseToChar(".-."));
    }

    @Test
    public void toS() {
        Assert.assertEquals('S', translator.morseToChar("..."));
    }

    @Test
    public void toT() {
        Assert.assertEquals('T', translator.morseToChar("-"));
    }

    @Test
    public void toU() {
        Assert.assertEquals('U', translator.morseToChar("..-"));
    }

    @Test
    public void toV() {
        Assert.assertEquals('V', translator.morseToChar("...-"));
    }

    @Test
    public void toW() {
        Assert.assertEquals('W', translator.morseToChar(".--"));
    }

    @Test
    public void toX() {
        Assert.assertEquals('X', translator.morseToChar("-..-"));
    }

    @Test
    public void toY() {
        Assert.assertEquals('Y', translator.morseToChar("-.--"));
    }

    @Test
    public void toZ() {
        Assert.assertEquals('Z', translator.morseToChar("--.."));
    }

    @Test
    public void to0() {
        Assert.assertEquals('0', translator.morseToChar("-----"));
    }

    @Test
    public void to1() {
        Assert.assertEquals('1', translator.morseToChar(".----"));
    }

    @Test
    public void to2() {
        Assert.assertEquals('2', translator.morseToChar("..---"));
    }

    @Test
    public void to3() {
        Assert.assertEquals('3', translator.morseToChar("...--"));
    }

    @Test
    public void to4() {
        Assert.assertEquals('4', translator.morseToChar("....-"));
    }

    @Test
    public void to5() {
        Assert.assertEquals('5', translator.morseToChar("....."));
    }

    @Test
    public void to6() {
        Assert.assertEquals('6', translator.morseToChar("-...."));
    }

    @Test
    public void to7() {
        Assert.assertEquals('7', translator.morseToChar("--..."));
    }

    @Test
    public void to8() {
        Assert.assertEquals('8', translator.morseToChar("---.."));
    }

    @Test
    public void to9() {
        Assert.assertEquals('9', translator.morseToChar("----."));
    }

    @Test
    public void fromA() {
        Assert.assertEquals(".-", translator.charToMorse('A'));
    }

    @Test
    public void fromB() {
        Assert.assertEquals("-...", translator.charToMorse('B'));
    }

    @Test
    public void fromC() {
        Assert.assertEquals("-.-.", translator.charToMorse('C'));
    }

    @Test
    public void fromD() {
        Assert.assertEquals("-..", translator.charToMorse('D'));
    }

    @Test
    public void fromE() {
        Assert.assertEquals(".", translator.charToMorse('E'));
    }

    @Test
    public void fromF() {
        Assert.assertEquals("..-.", translator.charToMorse('F'));
    }

    @Test
    public void fromG() {
        Assert.assertEquals("--.", translator.charToMorse('G'));
    }

    @Test
    public void fromH() {
        Assert.assertEquals("....", translator.charToMorse('H'));
    }

    @Test
    public void fromI() {
        Assert.assertEquals("..", translator.charToMorse('I'));
    }

    @Test
    public void fromJ() {
        Assert.assertEquals(".---", translator.charToMorse('J'));
    }

    @Test
    public void fromK() {
        Assert.assertEquals("-.-", translator.charToMorse('K'));
    }

    @Test
    public void fromL() {
        Assert.assertEquals(".-..", translator.charToMorse('L'));
    }

    @Test
    public void fromM() {
        Assert.assertEquals("--", translator.charToMorse('M'));
    }

    @Test
    public void fromN() {
        Assert.assertEquals("-.", translator.charToMorse('N'));
    }

    @Test
    public void fromO() {
        Assert.assertEquals("---", translator.charToMorse('O'));
    }

    @Test
    public void fromP() {
        Assert.assertEquals(".--.", translator.charToMorse('P'));
    }

    @Test
    public void fromQ() {
        Assert.assertEquals("--.-", translator.charToMorse('Q'));
    }

    @Test
    public void fromR() {
        Assert.assertEquals(".-.", translator.charToMorse('R'));
    }

    @Test
    public void fromS() {
        Assert.assertEquals("...", translator.charToMorse('S'));
    }

    @Test
    public void fromT() {
        Assert.assertEquals("-", translator.charToMorse('T'));
    }

    @Test
    public void fromU() {
        Assert.assertEquals("..-", translator.charToMorse('U'));
    }

    @Test
    public void fromV() {
        Assert.assertEquals("...-", translator.charToMorse('V'));
    }

    @Test
    public void fromW() {
        Assert.assertEquals(".--", translator.charToMorse('W'));
    }

    @Test
    public void fromX() {
        Assert.assertEquals("-..-", translator.charToMorse('X'));
    }

    @Test
    public void fromY() {
        Assert.assertEquals("-.--", translator.charToMorse('Y'));
    }

    @Test
    public void fromZ() {
        Assert.assertEquals("--..", translator.charToMorse('Z'));
    }

    @Test
    public void from0() {
        Assert.assertEquals("-----", translator.charToMorse('0'));
    }

    @Test
    public void from1() {
        Assert.assertEquals(".----", translator.charToMorse('1'));
    }

    @Test
    public void from2() {
        Assert.assertEquals("..---", translator.charToMorse('2'));
    }

    @Test
    public void from3() {
        Assert.assertEquals("...--", translator.charToMorse('3'));
    }

    @Test
    public void from4() {
        Assert.assertEquals("....-", translator.charToMorse('4'));
    }

    @Test
    public void from5() {
        Assert.assertEquals(".....", translator.charToMorse('5'));
    }

    @Test
    public void from6() {
        Assert.assertEquals("-....", translator.charToMorse('6'));
    }

    @Test
    public void from7() {
        Assert.assertEquals("--...", translator.charToMorse('7'));
    }

    @Test
    public void from8() {
        Assert.assertEquals("---..", translator.charToMorse('8'));
    }

    @Test
    public void from9() {
        Assert.assertEquals("----.", translator.charToMorse('9'));
    }

    @Test
    public void bfs() {
        String[] gold = new String[]{
                ".",
                "-",
                "..",
                ".-",
                "-.",
                "--",
                "...",
                "..-",
                ".-.",
                ".--",
                "-..",
                "-.-",
                "--.",
                "---",
                "....",
                "...-",
                "..-.",
                ".-..",
                ".--.",
                ".---",
                "-...",
                "-..-",
                "-.-.",
                "-.--",
                "--..",
                "--.-",
                ".....",
                "....-",
                "...--",
                "..---",
                ".----",
                "-....",
                "--...",
                "---..",
                "----.",
                "-----",
        };

        LinkedList<String> codes = translator.getCodes();

        Assert.assertEquals(gold.length, codes.size());

        int i = 0;

        for(String code: codes) {
            Assert.assertEquals(gold[i], code);

            i++;
        }
    }
}
