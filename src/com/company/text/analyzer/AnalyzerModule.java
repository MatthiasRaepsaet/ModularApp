package com.company.text.analyzer;

/**
 * Created by Matthias on 20/05/2017.
 */
public class AnalyzerModule {
    private PosiNegaAnalyzer posiNegaAnalyzer = new PosiNegaAnalyzer();
    private Counter counter = new Counter();

    public int getPositiveScore(){
        return posiNegaAnalyzer.getPositiveScore();
    }

    public int getNegativeScore(){
        return posiNegaAnalyzer.getNegativeScore();
    }

    public void analyzeSentence(String[] words){
        posiNegaAnalyzer.analyzeSentence(words);
    }

    public int countWords(String[] words){
        return counter.countWordsInSentence(words);
    }
}
