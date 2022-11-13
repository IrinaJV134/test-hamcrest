import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

class MainTest {

    @Test
    public void givenList_whenCheck_thenHasItem() {
        List<String> fruits = asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");
        assertThat(fruits, hasItem("Apple"));

    }

    @Test
    public void givenList_whenCheck_thenSize3() {
        List<String> fruits = asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");
        assertThat(fruits, hasSize(6));

    }

    @Test
    public void contains() {
        List<String> fruits = asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");

        assertThat(fruits, hasItems("Orange", "Banana"));
    }

    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<String> fruits = asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");
        assertThat(fruits, is(not(empty())));
    }
}





