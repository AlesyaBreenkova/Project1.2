package StaticClassesEnumsExeptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

//
//    enum final constants

  //  double calculate(double a, double b, Type type){



   private static final Logger logger = LogManager.getLogger(Calculator.class);


    public enum Type{

        MULTIPLICATION, SUMMARY, DIVISION, SUBSTRACTION
    }
    public static double calculate(double a, double b, Type type) {

       logger.info("Running the calculate method");
        double result=0;
//        if (type == MULTIPLICATION) {
//            return a * b;
   // }
     //else if(type = SUMMARY);

       //         return 0;
        try {

        switch(type){
            case MULTIPLICATION:
                result=a*b;
                break;
            case SUMMARY:
                result=a+b;
                break;

            case DIVISION:
                result= a/b;
                break;

            case SUBSTRACTION:
                result=a-b;
                break;


            default:
                result=-1;
        }


        }

        catch(Exception err) {
            logger.error("Something has gone wrong", err);
            throw err;
        }

      //  finally {
        //    System.out.println("You've reached the 'finally' block");
        //}
            return result;





    }


}