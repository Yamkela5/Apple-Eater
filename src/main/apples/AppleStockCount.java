package main.apples;

public class AppleStockCount {
  public static void main(String[] apples) {

    if (apples.length == 0) {
      System.out.println("Please give me a qty!");
      return;
    }

    int qty = Integer.parseInt(apples[0]);

    if (apples.length == 1){
      System.out.println("Please give me the price!");
      return;
    }

    double cost = Double.parseDouble(apples[1]);

    double total;
    int dozen = 0;

    if (qty < 1) {
      System.out.println("Out of stock.");
    }
    else {

      total = qty * cost;

      if ( (qty % 12) == 0)  {

        dozen = qty / 12;

      }



      StringBuilder message = new StringBuilder();
      message.append("You have bought ");

      if(dozen < 1){
        message.append(qty);

        message.append(" of");
        message.append(" apple");
        if (qty > 1) {
          message.append("s");
        }
        message.append(" for a total cost of ");
        message.append(String.format("%.2f",total));
        message.append(".");
      }

      else {
        message.append(dozen);
        message.append(" dozen");
        if(dozen > 1){
          message.append("s");
        }

        message.append(" of");
        message.append(" apple");
        if (qty > 1) {
          message.append("s");
        }
        message.append(" for a total cost of ");
        message.append(String.format("%.2f",total));
        message.append(".");

      }

      System.out.println(message.toString());

    }


  }
}


