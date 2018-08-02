package com.deloitte.pojo;

public class TextEditor {
	
	private SpellChecker spellChecker;
	public TextEditor( SpellChecker spellChecker) {
		System.out.println("Inside texteditors constructor");
		this.spellChecker=spellChecker;
	}
	
	public TextEditor() {
		System.out.println("Inside texteditor sdi constructor");
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
}
