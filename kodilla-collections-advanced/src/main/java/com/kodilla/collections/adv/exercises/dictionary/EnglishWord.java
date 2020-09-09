package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getPartOfSpeech() {

        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return getPartOfSpeech() == that.getPartOfSpeech() &&
                getWord().equals(that.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPartOfSpeech(), getWord());
    }
}
