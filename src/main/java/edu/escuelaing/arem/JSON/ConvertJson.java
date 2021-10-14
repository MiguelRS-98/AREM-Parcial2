package edu.escuelaing.arem.JSON;

import org.json.simple.JSONObject;

public class ConvertJson 
{
    @SuppressWarnings("unchecked")
    public static Object JSONFormat (String inpOper, String inpNum, Double outNum)
    {
        JSONObject Json = new JSONObject();
        Double inpNumDou = Double.valueOf(inpNum);
        Json.put("Operation",inpOper);
        Json.put("Input",inpNumDou);
        Json.put("Output",outNum);
        return Json;
    }
}
