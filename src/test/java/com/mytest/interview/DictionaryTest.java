package com.mytest.interview;

import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {
	
	@Test
	public void validateNonExistingWord() {
		Assert.assertEquals("Non Existing", false, Dictionary.isEnglishWord("hhh"));
	}
	@Test
	public void validateExistingWord() {
		Assert.assertEquals("Existing", true, Dictionary.isEnglishWord("ab"));
	}
	@Test
	public void validateBlankvalue() {
		Assert.assertEquals("non Existing", false, Dictionary.isEnglishWord(""));
	}
	@Test
	public void validateSpecialCharactersvalue() {
		Assert.assertEquals("non Existing", false, Dictionary.isEnglishWord("@#$%^"));
	}
	@Test
	public void validateStringNumbersvalue() {
		Assert.assertEquals("non Existing", false, Dictionary.isEnglishWord("1234"));
	}
	@Test
	public void validateSpacesvalue() {
		Assert.assertEquals("non Existing", false, Dictionary.isEnglishWord("     "));
	}

}
