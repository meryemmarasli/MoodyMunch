import java.util.*;
import java.io.*;

public class Mood
{
  private int moodQuantifier;
  private int userInput;

  public Mood(){
    // empty
  }

  public int getMood(){
    return moodQuantifier;
  }

  public void setMood(int moodQuantifier){
    this.moodQuantifier = moodQuantifier;
  }

  public void setInput(int userInput){ // value of the current/last filled survey result
    this.userInput = userInput;
  }

  public int getInput(){ //gets value of the current/last filled survey result
    return userInput;
  }

  public void incrementor(int userInput){
    this.setMood(this.getMood() + this.getInput());
  }
}	// END MOOD CLASS
