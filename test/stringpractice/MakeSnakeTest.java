package stringpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeSnakeTest {

    @Test
    public void mixedSsTest() {
        assertEquals("SSSnake sssoundsss", MakeSnake.makeSnake("Snake sounds"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("", MakeSnake.makeSnake(""));
    }
}
