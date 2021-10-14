package edu.escuelaing.arem.app.calculator;

import edu.escuelaing.arem.JSON.ConvertJson;
import edu.escuelaing.arem.service.ServicesMath;
import static spark.Spark.*;

public class App 
{   
    public static void main (String[] args)
    {
        staticFiles.location("/public");
        port(getPort());
        get("/hello", (request,response) -> "Hello!" );
        get("/cos", (request, response) -> ConvertJson.JSONFormat("cos",request.queryParams("value"), ServicesMath.cosMathService(request.queryParams("value"))));
        get("/exp", (request, response) -> ConvertJson.JSONFormat("exp",request.queryParams("value"), ServicesMath.expMathService(request.queryParams("value"))));
    }
    private static int getPort () 
    {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    } 
}