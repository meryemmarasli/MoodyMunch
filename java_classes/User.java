import java.util.*;
import java.io.*;

public class User
{
  private String username;
  private String password;

  private boolean sex;

  private double height;
  private int activityLevel;
  private double weight;
  private double goalWeight;
  private int numTimesMoodLogged;
  private int totalMood;
  private int age;

  public User(String username, String password, double height, boolean sex, double goalWeight, double weight, int activityLevel, int age){
    this.username = username;
    this.password = password;
    this.height = height;
    this.sex = sex;
    this.goalWeight = goalWeight;
    this.weight = weight;
    this.activityLevel = activityLevel;
    this.age = age;

    numTimesMoodLogged = 0;
  }

  public String getUsername(){
      return username;
  }

  public void setUsername(String username){
      this.username = username;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public int getAge(){
    return age;
   }

  public void setAge(int age){
     this.age = age;
   }

  public boolean getSex(){
    return sex;
  }

  public void setSex(boolean sex){ // true == female // false = male
    this.sex = sex;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public int getActivityLevel(){
    return activityLevel;
  }

  public void setActivityLevel(int activityLevel){
    this.activityLevel = activityLevel;
  }

  public double getGoalWeight(){
    return goalWeight;
  }

  public void setGoalWeight(double goalWeight){
    this.goalWeight = goalWeight;
  }

  public void setWeight(double weight){
     this.weight = weight;
   }

  public double getWeight(){
      return weight;
   }

  public int getNumTimesMoodLogged(){
    return numTimesMoodLogged;
  }

  public void setNumTimesMoodLogged(int numTimesMoodLogged){
    this.numTimesMoodLogged = numTimesMoodLogged;
  }

  public void incrementNumTimesMoodLogged(){
     numTimesMoodLogged++;
   }

  public int getTotalMood(){
    return totalMood;
  }

  public void setTotalMood(int totalMood){
    this.totalMood = totalMood;
  }

  public void add(int t){
     totalMood = totalMood + t;
   }
}	// END USER CLASS
