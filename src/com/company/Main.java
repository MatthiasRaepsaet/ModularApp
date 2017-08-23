package com.company;

import com.company.text.analyzer.AnalyzerModule;
import com.company.text.scanner.ScannerModule;
import com.company.text.splitter.SplitterModule;

public class Main {
    public static void main(String[] args) {
//        Here we declare all modules we need to use to get the application running
        ScannerModule scannerModule = new ScannerModule();
        SplitterModule splitterModule = new SplitterModule();
        AnalyzerModule analyzerModule = new AnalyzerModule();

//        The first step is to get the information from the user
        String mySentence = scannerModule.useScanner();

//        The second step is to split te received sentence into an array of words
        String[] wordsArray =  splitterModule.splitSentence(mySentence);

//        The third part, we analyze the sentence by passing the parameter "wordsArray" to the methods of the analyzerModule
        analyzerModule.analyzeSentence(wordsArray);
        System.out.println("Positive: " + analyzerModule.getPositiveScore());
        System.out.println("Negative: " + analyzerModule.getNegativeScore());
//        Hier tonen we aan dat er 2 klassen counter naast elkaar gebruikt kunnen worden met dezelfde methode namen
        System.out.println("Count of analyzer: " + analyzerModule.countWords(wordsArray));
        System.out.println("Count of splitter: " + splitterModule.countWords(wordsArray));
    }
}
