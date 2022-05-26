/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;


public class convertions {
    public static String what="Αριθμοί";
    public static String from="δεκαδικο";
    public static String to="δυαδικο";
    //-------------------------------------------
    public static String dekadikos_to_diadikos(int a){
        String apotelesma = Integer.toBinaryString(a);
        return apotelesma;
    }
    
     public static String dekadikos_to_octal(int a){
        String apotelesma = Integer.toOctalString(a);
        return apotelesma;
    }
    public static String dekadikos_to_hex(int a){
        String apotelesma = Integer.toHexString(a);
        return apotelesma;
    }
    public static int diadikos_to_dekadikos(String a){
        int decimal=Integer.parseInt(a,2);  
        return decimal;
    }
   public static String diadikos_to_oktadikos(String a){
       int x =diadikos_to_dekadikos(a);
       String octa= Integer.toOctalString(x);
       return octa;
    }
  public static String diadikos_to_hex(String a){
       int x =diadikos_to_dekadikos(a);
       String hex= Integer.toHexString(x);
       return hex;
    }
  public static String octal_to_dekadiko(String a){
     int decimal=Integer.parseInt(a,8);   
     return Integer.toString(decimal);
  
  }
  public static String octal_to_diadiko(String a){
      String x=octal_to_dekadiko(a);
      return dekadikos_to_diadikos(Integer.parseInt(x));
  }
 
  public static String octal_to_hex(String a){
      String x=octal_to_dekadiko(a);
      return dekadikos_to_hex(Integer. parseInt(x));
  }
  public static String hex_to_dekadiko(String a){
     int decimal=Integer.parseInt(a,16);   
     return Integer.toString(decimal) ;
  
  }
  public static String hex_to_diadiko(String a){
    String p =  hex_to_dekadiko(a);
    String apotelesma = dekadikos_to_diadikos(Integer.parseInt(p));
    return apotelesma;
  
  }
  public static String hex_to_octal(String a){
    String p =  hex_to_dekadiko(a);
    String apotelesma = dekadikos_to_octal(Integer.parseInt(p));
    return apotelesma;
  
  }
 //________________________________________________________________________________
  public static String kilos_to_grams(String a){
    int apotelesma = Integer.parseInt(a)*1000;
    return Integer.toString(apotelesma);
  }
   
  public static String kilos_to_libres(String a){
    double apotelesma = (Double.valueOf(Integer.parseInt(a))*2.20462262);
    return Double.toString(apotelesma);
  }
   
   public static String kilos_to_tonos(String a){
    double apotelesma = (Double.valueOf(Integer.parseInt(a))*0.001);
    return Double.toString(apotelesma);
  }
   
  
    public static String grams_to_Kilos(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/1000);
        return Double.toString(apotelesma);
  } 
    public static String grams_to_libres(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*0.0022046);
        return Double.toString(apotelesma);
  }
    public static String grams_to_tons(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*0.000001);
        return Double.toString(apotelesma);
  } 
    
    
    
    public static String libres_to_kilos(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 0.45359237);
        return Double.toString(apotelesma);
  }
    public static String libres_to_grams(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*  453.59237);
        return Double.toString(apotelesma);
  } 
    public static String libres_to_tons(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/  2000);
        return Double.toString(apotelesma);
  }
    
    public static String tons_to_kilos(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 1000);
        return Double.toString(apotelesma);
  }
    public static String tons_to_grams(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 1000000);
        return Double.toString(apotelesma);
  }
    public static String tons_to_libres(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 2000);
        return Double.toString(apotelesma);
  }
   //____________________________________________________
    
    
    public static String metre_to_km(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/ 1000);
        return Double.toString(apotelesma);
  }
    public static String metre_to_ekatosta(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 100);
        return Double.toString(apotelesma);
  }
    public static String metre_to_milia(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 0.0006);
        return Double.toString(apotelesma);
  }
    
    
   public static String km_to_metres(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 1000);
        return Double.toString(apotelesma);
  }
   public static String km_to_ekatosta(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 100000);
        return Double.toString(apotelesma);
  }
    public static String km_to_miles(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 0.62137);
        return Double.toString(apotelesma);
  }
    
    
    
     public static String ekatosta_to_miles(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/160934);
        return Double.toString(apotelesma);
  }
    public static String ekatosta_to_metres(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/100);
        return Double.toString(apotelesma);
  }
    public static String ekatosta_to_km(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/ 100000);
        return Double.toString(apotelesma);
  }
    
    
    public static String miles_to_km(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 1.60934);
        return Double.toString(apotelesma);
  }
    
   public static String miles_to_ekatosta(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 160934);
        return Double.toString(apotelesma);
  }
    
     public static String miles_to_metre(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 1609);
        return Double.toString(apotelesma);
  }
  
  //____________________________________________________________________________
     
     
      public static String galonia_to_litre(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))* 3.785);
        return Double.toString(apotelesma);
  }
       public static String galonia_to_m3(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/264);
        return Double.toString(apotelesma);
  }
   
      public static String m3_to_galonia(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*264);
        return Double.toString(apotelesma);
  }
      public static String m3_to_litre(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*1000);
        return Double.toString(apotelesma);
  
     } public static String litre_to_m3(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))/1000);
        return Double.toString(apotelesma);
  }
       public static String litre_to_galonia(String a){
        double apotelesma = (Double.valueOf(Integer.parseInt(a))*0.264172 );
        return Double.toString(apotelesma);
  }
     
     
  
  
  
  
  
    

}
