package com.company.text.scanner;

/**
 * Created by Matthias on 20/05/2017.
 */
public class ScannerModule {

    private SentenceScanner sentenceScanner =  new SentenceScanner();

    public String useScanner(){
        System.out.println("Please enter a sentence: ");
        return sentenceScanner.readConsole();
    }
}
