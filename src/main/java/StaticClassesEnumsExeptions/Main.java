package StaticClassesEnumsExeptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        double result = Calculator.calculate(2, 3, null);
        logger.info("result: " + result);

//try {
    result = Calculator.calculate(20, 14, Calculator.Type.MULTIPLICATION);
    System.out.println("result: " + result);
//}

//catch(Exception err) {
  //  System.out.println("Something has gone wrong");
//}

        result = Calculator.calculate(109, 14, Calculator.Type.SUBSTRACTION);
        logger.info("result" + result);

        logger.info("result: " + result);


        result = Calculator.calculate(109, 14, Calculator.Type.DIVISION);
        logger.info("result" + result);

        System.out.println("result: " + result);
    }
}
