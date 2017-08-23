package com.company.text.splitter;

/**
 * Created by Matthias on 20/05/2017.
 */
public class SplitterModule {
    private SentenceSplitter sentenceSplitter = new SentenceSplitter();
    private Counter counter = new Counter();

    public String[] splitSentence(String sentence){
        return this.sentenceSplitter.splitSentence(sentence);
    }

    public int countWords(String[] words){
        return this.counter.countWords(words);
    }

}
