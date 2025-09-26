public class Auto {
      String name;
      String make;
      String model;
      double liability;
      double collision;
      double comFormula;
      //constructor
      public Auto (String fn, String ln, String mk, String md, double liab, double coll){   
            name = fn + " " + ln;
            make = mk;
            model = md;
            liability = liab;
            collision = coll;
            comFormula = (liability + collision) * 0.30f;
      }
      public void setFirstName(String fname){
            name = fname; 
      }
      public void setLastName(String lname){
            name = lname; 
      }
      public String getName(){
            return name;
      }
      public String getFirstName(){
            return name;
      }
      public String getLastName(){
            return name;
      }
      public void setMake(String mk){
            make = mk; 
      }
      public String getMake(){
            return make;
      }
      public void setModel(String md){
            model = md; 
      }
      public String getModel(){     
            return model;
      }
      public void setLiability(float liab){
            liability = liab; 
      }
      public double getLiability(){
            return liability;
      }
      public void setCollision(float coll){
            collision = coll; 
      }
      public double getCollision(){
            return collision;
      }
      public double computeCommission(){
            return comFormula;
      }
    }

