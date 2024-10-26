package oldshelf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class OldSelectionTest {

    @Test
    void testGetAgeOrTitlePositive() {
        // Positive test case with valid objects
        TextBook textBook = new TextBook("Data Structures by CLRS");
        Comic comic = new Comic("Iron Man", 35);
        Fiction fiction = new Fiction("Macbeth", FictionType.Tragedy);

        assertEquals("Data Structures by CLRS", OldSelection.getAgeOrTitle(textBook));
        assertEquals("Iron Man", OldSelection.getAgeOrTitle(comic));
        assertEquals("Macbeth", OldSelection.getAgeOrTitle(fiction));
    }

    @Test
    void testGetAgeOrTitleNegative() {
        // Negative test case with an invalid object
        Object notABook = new Object(); // Not an instance of Book
        assertEquals("", OldSelection.getAgeOrTitle(notABook));
    }
}