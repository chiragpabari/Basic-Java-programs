import engine.make_engine;
import body.car_body;

public class CarCompany{
  public static void main(String args[]){
     
    make_engine e1 = new make_engine();
    e1.msg1();

    car_body b1 = new car_body();
    b1.msg2();
  }
}