package com.company.text.splitter;

/**
 * Created by Matthias on 20/05/2017.
 */
class SentenceSplitter {

    protected SentenceSplitter() {
    }

    protected String[] splitSentence(String sentence){
        sentence.replace(".", "");
        return sentence.split(" ");
    }
}
