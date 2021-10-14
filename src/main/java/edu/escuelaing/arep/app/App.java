package edu.escuelaing.arep.app;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 * Clase principal encargada de llevar a cabo la ejecucion de todo el programa.
 * @author  Juan Sebastián Muñoz Dorado
 * @version 1.0.  (14 de Octubre del 2021) 
 */
public class App {
    private static Calculadora calcular = new Calculadora(); 

    public static void main(String[] args) {
        port(getPort());
        get("/atan", (req, res) -> inputDataPage(req, res,"atan"));
        get("/sin", (req, res) -> inputDataPage(req, res,"sin"));
    }

    private static JSONObject inputDataPage(Request req, Response res,String operation) {
        double number = Double.parseDouble(req.queryParams("value"));
        JSONObject obj = new JSONObject();
        obj.put("operation",operation);
        obj.put("input",number);
        obj.put("output",(operation.equals("atan"))? calcular.arcTangent(number) : calcular.sin(number));
        return obj;
    }

   static int getPort() {
       if (System.getenv("PORT") != null) {
           return Integer.parseInt(System.getenv("PORT"));
       }
       return 3456;
   }
}