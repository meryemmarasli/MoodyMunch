import java.util.*;
import java.io.*;

public class Diet
{
  private int caloricTotal;
  private int carbTotal;
  private int fatTotal;
  private int proteinTotal;

  public class Diet(){
    //empty
  }

  public int getCaloricTotal(){
    return caloricTotal;
  }

  public void setCaloricTotal(int caloricTotal){
    this.caloricTotal = caloricTotal;
  }

  public int getCarbTotal(){
    return carbTotal;
  }

  public void setCarbTotal(int carbTotal){
    this.carbTotal = carbTotal;
  }
  public int getFatTotal(){
    return fatTotal;
  }

  public void setFatTotal(int fatTotal){
    this.fatTotal = fatTotal;
  }
  public int getProteinTotal(){
    return proteinTotal;
  }

  public void setProteinTotal(int proteinTotal){
    this.proteinTotal = proteinTotal;
  }

  public int[] search(String foodItem){
    return nutritionix.search(foodItem); // searches database and returns cal,carb, fat, protein of ite
    //needs to be implemented more properly after database portion has been completed
  }

  public void increment(int[] foodInfo){
    if(foodInfo.size != 4){
      return;
    }

    this.setCaloricTotal(this.getCaloricTotal() + foodInfo[0]);
    this.setCarbTotal(this.getCarbTotal() + foodInfo[1]);
    this.setFatTotal(this.getFatTotal() + foodInfo[2]);
    this.setProteinTotal(this.getProteinTotal() + foodInfo[3]);

  }

}	// END DIET CLASS
