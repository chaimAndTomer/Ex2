import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {
	@Test
	public void test_for_example() {
		Assert.assertTrue(5 == 4 + 1);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, -3, 15, Integer.MAX_VALUE }) // six numbers
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
		Assert.assertEquals(isOdd(number), true);
	}

	public static boolean isOdd(int number) {
		return (number / 2)*2 != number;
	}
}
