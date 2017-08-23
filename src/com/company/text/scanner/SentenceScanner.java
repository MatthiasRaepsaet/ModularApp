package com.company.text.scanner;

import java.util.Scanner;

/**
 * Created by Matthias on 19/05/2017.
 */
class SentenceScanner {

    private Scanner input;

    protected SentenceScanner() {
        this.input = new Scanner(System.in);
    }

    protected String readConsole(){
        return this.input.nextLine();
    }
}
