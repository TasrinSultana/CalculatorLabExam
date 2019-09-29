package com.example.calculatorlabexam;
import android.util.Log;

public class Calculation {
    public static String add(String num1, String num2) {
        Double a=0.0,b=0.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Log.i("Ok",num1+","+num2);
        Double result = a+b;
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(a-m!=0 || b-n!=0)
            return result.toString();
        return String.valueOf(result.intValue());
    }
    public static String subtract(String num1, String num2) {
        Double a=0.0,b=0.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Double result =a-b;
        Log.i("Ok",num1+","+num2+","+result.toString());
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(a-m!=0 || b-n!=0)
            return result.toString();
        return String.valueOf(result.intValue());
    }
    public static String multiply(String num1, String num2) {
        Double a=1.0,b=1.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Double result =a*b;
        Log.i("Ok",num1+","+num2+","+result.toString());
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(a-m!=0 || b-n!=0)
            return result.toString();
        return String.valueOf(result.intValue());
    }

    public static String division(String num1, String num2) {
        Double a=1.0,b=1.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Double result =a/b;
        Log.i("Ok",num1+","+num2+","+result.toString());
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(result-result.intValue()!=0 || a-m!=0 || b-n!=0)
            return result.toString();
        return String.valueOf(result.intValue());
    }
    public static String power(String num1, String num2) {
        Double a=0.0,b=1.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Double result =Math.pow(a,b);
        Log.i("Ok",num1+","+num2+","+result.toString());
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(a-m!=0 || b-n!=0)
            return result.toString();
        return String.valueOf(result.intValue());
    }
    public static String root(String num1, String num2) {
        Double a=2.0,b=1.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        Double result =Math.pow(b,1.0/a); //Math.pow(Math.E, Math.log(a)/b);
        Log.i("Ok",num1+","+num2+","+result.toString());
        int m,n;
        m=a.intValue();
        n=b.intValue();
        if(a-m!=0 || b-n!=0 || result-result.intValue()!=0)
            return result.toString();
        Log.i("Ok",String.valueOf(result.intValue()));
        return String.valueOf(result.intValue());
    }
    public static String modulas(String num1, String num2) {
        Double a=0.0,b=1.0;
        if(num1!="") a=Double.parseDouble(num1);
        if(num2!="") b=Double.parseDouble(num2);
        int m,n;
        Integer resutlt=null;
        m=a.intValue();
        n=b.intValue();
        if(a-m==0 && b-n==0){
            resutlt=m%n;
            return resutlt.toString();
        }
        return "Undefined";
    }

}
