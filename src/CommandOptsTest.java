import static org.junit.Assert.assertEquals;

public class CommandOptsTest {

	@org.junit.Test
	public void optionsTest1() throws Exception {
		String[] args = { "--guesses", "2", "--hints", "4", "words.txt" };
		CommandOpts opts = new CommandOpts(args);
		assertEquals(opts.maxguesses, 2);
		assertEquals(opts.maxhints, 4);
		assertEquals(opts.wordsource, "words.txt");
	}

}
