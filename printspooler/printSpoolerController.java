package com.j2.singleton.printspooler;

public class printSpoolerController {
  public static void main(String args[]) {
    printSpooler print = printSpooler.getInstance();
    print.printBlackDocuments();
    print.printColorPictures();
    
    printSpooler print2 = printSpooler.getInstance();
  }
}