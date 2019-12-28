import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void when_trible_should_return_fizz() {
        assertThat(fizzBuzz.numOff(6)).isEqualTo("fizz");
    }

    @Test
    public void when_five_should_return_buzz() {
        assertThat(fizzBuzz.numOff(5)).isEqualTo("buzz");
    }

    @Test
    public void when_fifteen_should_return_fizzbuzz() {
        assertThat(fizzBuzz.numOff(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void when_other_should_return_num() {
        assertThat(fizzBuzz.numOff(7)).isEqualTo("7");
    }
}

