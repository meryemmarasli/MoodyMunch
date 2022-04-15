import java.util.*;
import java.io.*;

public class Output
{
  private double BMR;
  private int deltaToBMR;
  // ideal Macros
  private int idealFat;
  private int idealCarb;
  private int idealProtein;

  private int deltaCarb;
  private int deltaFat;
  private int idealProtein;

  private String derivedSessionMood;
  private String derivedAverageMood;
  public String  derivedComparison; // session and average derivedSesionMood


  // the other classes
  private User user;
  private Diet diet;
  private Mood mood;

  public Output(User user, Diet diet, Mood mood){
    this.user = user;
    this.diet = diet;
    this.mood = mood;


    idealProtein = 1.2*user.getWeight();
    idealFat = .25 * user.getWeight();
    idealCarb = 2.5*user.getWeight();

    deltaCarb = diet.getCarbTotal() - idealCarb;
    deltaFat = diet.getFatTotal() - idealFat;
    idealProtein =  diet.getProteinTotal() - idealProtein;
  }

    public double getIdealProtein(){
      return idealProtein;
    }

    public double getIdealFat(){
      return idealFat;
    }

    public double getIdealCarb(){
      return idealCarb;
    }

    public double getDeltaProtein(){
      return deltaProtein;
    }

    public double getDeltaCarb(){
      return deltaCarb;
    }

    public double getDeltaFat(){
      return deltaFat;
    }


  public double calculateBMR(){
    // BMR = 10* weight (kg) + 6.25 * height (cm) - 5*age(y) + s -- s =  +5 for males & -161 for females
    double kiloWeight = user.getWeight() * 0.45359237;
    double cmHeight = user.getHeight() * 2.54;
    int s = 0;
    if(user.getSex() == false){ // male
      s = 5;
    }else{ // female
      s = -161;
    }

    double BMR = 10*kiloWeight + 6.25*cmHeight - 5*user.getAge() + s;

    return BMR;
  }


  public double AverageMood(){
      double total = user.add(mood.getMood());
      double numOfSessions = user.incrementNumTimesMoodLogged();
      return total/numOfSessions;
  }
    /*
    mood data:
    bad < 0
    okay = 1 to 25
    good = 26 to 50
    great > 50
    */
  public String deriveAverageMood(){
    double averageMood = AverageMood();
     if(averageMood < 0 ){
        derivedAverageMood = "Bad";
     }else if(averageMood >= 0 && averageMood <= 25){
        derivedAverageMood =  "Okay";
     }else if(averageMood >= 26 && averageMood <= 50){
       derivedAverageMood = "Good";
     }else if(averageMood > 50){
       derivedAverageMood = "Great";
     }
      return derivedAverageMood;
  }

  public String deriveSessionMood(){
    int sessionMood = mood.getMood();
    if(sessionMood < 0 ){
       sessionMood = "Bad";
    }else if(sessionMood >= 0 && sessionMood <= 25){
       derivedSesionMoodessionMood =  "Okay";
    }else if(sessionMood >= 26 && sessionMood <= 50){
      derivedSessionMood = "Good";
    }else if(sessionMood > 50){
      derivedSessionMood= "Great";
    }
     return derivedSessionMood;
 }

  }

  public String compareMood(){
      if(mood.getMood() >= AverageMood()){
        return "better";
      }

      return "worse";
  }

  public String[] reccomendProtein(){
      if(deltaProtein < 0){
        return nutrionix.getListWithHigh("Protein"); // returns list of foods that have high protein
      }
      System.out.println("Eat Less Protein");
      return "";
  }


  public String[] reccomendCarb(){
    if(deltaCarb < 0){
      return nutrionix.getListWithHigh("Carb"); // returns list of foods that have high carbs
    }
    System.out.println("Eat Less Carbs");
    return "";
  }


  public String[] reccomendFat(){
    if(deltaFat < 0){
      return nutrionix.getListWithHigh("Fat"); // returns list of foods that have high fat
    }
    System.out.println("Eat Less Fat");
    return "" ;
  }

}	// END OUTPUT CLASS
