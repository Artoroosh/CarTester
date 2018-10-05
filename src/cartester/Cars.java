package cartester;
public class Cars {
  //variables for characteristics
  private String carMake, carModel, colour;
  private int year, price, seat;
  //constructors
  public Cars() {
    carMake = "Oldsmobile";
    carModel = "Super 88";
    colour = "Grey";
    year = 1949;
    price = 1735;
    seat = 9;
  }
  public Cars(String crMake, String crModel,String clr, int yr, int prc, int syl) {
    carMake = crMake;
    carModel = crModel;
    colour = crModel;
    year = yr;
    price = prc;
    seat = syl;
  }
  //Alternate constructor
  public Cars(String crMake, String crModel) {
   //This constructor only uses the name and breed
    carMake = crMake;
    carModel = crModel;
    colour = crModel;
    year = (int) (Math.random() * 10) + 1;
    price = (int) (Math.random() * 1000) + 1000;
    seat = (int) (Math.random() * 8);
  }
  public void honk() {
    System.out.println("Honk! Honk!");
  }
  //method to display all the car info
  public String toString() {
    String output = "Name: " + carMake + "\n";
    output += "Model: " + carModel + "\n";
    output += "Year: " + year + "\n";
    output += "Price: " + price + "$"+"\n";
    output += "There are: " + seat + " seats "+ "\n";
    //output string is complete, return it
    return output;
  }
}