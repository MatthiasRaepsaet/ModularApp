package com.company.text.analyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Matthias on 20/05/2017.
 */
class PosiNegaAnalyzer {
    private static final String[] POSITIVE = {"goed", "blij", "tevreden", "enthousiast"};
    private static final String[] NEGATIVE = {"slecht", "droevig", "kwaad", "ontevreden"};

    private int positiveScore;
    private int negativeScore;

    protected PosiNegaAnalyzer() {
        this.positiveScore = 0;
        this.negativeScore = 0;
    }

    protected int getPositiveScore() {
        return positiveScore;
    }

    protected int getNegativeScore() {
        return negativeScore;
    }

    public void setPositiveScore(int positiveScore) {
        this.positiveScore = positiveScore;
    }

    public void setNegativeScore(int negativeScore) {
        this.negativeScore = negativeScore;
    }

    protected void analyzeSentence(String[] words){
        for(String word : words){
            if(Arrays.asList(POSITIVE).contains(word)){
                setPositiveScore(getPositiveScore()+1);
            }
            if(Arrays.asList(NEGATIVE).contains(word)){
                setNegativeScore(getNegativeScore()+1);
            }
        }
    }

}
