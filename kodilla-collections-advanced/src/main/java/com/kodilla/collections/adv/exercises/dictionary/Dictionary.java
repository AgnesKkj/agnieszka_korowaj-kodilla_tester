package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    //mapa wg klucz: słowo, wartość: lista odpowiadających ang słów
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        //getOrDefault - zwraca wartość dla klucza lub wartość domyślną, jeśli nie ma odpowiedniej pary.
        // Tutaj: wartością domyślną jest pusta lista
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords (String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();
    }

    public int size() {
        return dictionary.size();
    }




}
