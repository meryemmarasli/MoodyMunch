import java.util.*;
import java.io.*;

public class User
{
	private String username;
  private String password;

  private boolean sex;

  private int height;
  private int activityLevel;
  private int goalWeight;
  private int numTimesMoodLogged;
  private int totalMood;

  public User(String username, String password, int height, boolean sex, int goalWeight, int activityLevel){
    this.username = username;
    this.password = password;
    this.height = height;
    this.sex = sex;
    this.goalWeight = goalWeight;
    this.activityLevel = activityLevel;
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

  public boolean getSex(){
    return sex;
  }

  public void setSex(boolean sex){
    this.sex = sex;
  }

  public int getHeight(){
    return height;
  }

  public void setHeight(int height){
    this.height = height;
  }

  public int getActivityLevel(){
    return activityLevel;
  }

  public void setActivityLevel(int activityLevel){
    this.activityLevel = activityLevel;
  }

  public int getGoalWeight(){
    return goalWeight;
  }

  public void setGoalWeight(int goalWeight){
    this.goalWeight = goalWeight;
  }

  public int getNumTimesMoodLogged(){
    return numTimesMoodLogged;
  }

  public void setNumTimesMoodLogged(int numTimesMoodLogged){
    this.numTimesMoodLogged = numTimesMoodLogged;
  }

  public int getTotalMood(){
    return totalMood;
  }

  public void setTotalMood(int totalMood){
    this.totalMood = totalMood;
  }
}	// END USER CLASS
