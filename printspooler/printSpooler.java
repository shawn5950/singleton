package com.j2.singleton.printspooler;

public class printSpooler {
  private boolean connect;
  private boolean emptyBlackInk;
  private boolean emptyColorInk;
  private static printSpooler uniqueInstance;
  private static int numCalled = 0;
 
  private printSpooler() {
    connect = true;
    emptyBlackInk = false;
    emptyColorInk = false;
  }
  
  //using synchronized to threadsafe
  public static synchronized printSpooler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating unique instance of print.");
      uniqueInstance = new printSpooler();
    }
    System.out.println("Returning instance of printSpooler");
    System.out.println("numCalled : " + numCalled++);
    return uniqueInstance;
  }
  
 //if printer is connected right and has black ink, you can print documents to black
  public void printBlackDocuments() {
    if (isConnect() && !isEmptyBlackInk()) {
     connect = true;
     emptyBlackInk = false;
    }
  }
 
  //if printer is connected right and has color ink, you can print color pictures
  public void printColorPictures() {
    if(isConnect() && !isEmptyColorInk()){
      connect = true;
      emptyColorInk = false;
    }
  }
   
  
 
  //Connect print to computer
  public boolean isConnect() {
    return connect;
  }
 
  //empty black ink
  public boolean isEmptyBlackInk() {
    return emptyBlackInk;
  }
  
  //empty color ink
  public boolean isEmptyColorInk() {
    return emptyColorInk;
  }
}