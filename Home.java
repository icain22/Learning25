public class Home {
      String name;
      String oneName;
      String twoName;
      int sqrfoot;
      float dwelling;
      float contents;
      float liability;
      float saleFormula;
      //constructor 
      public Home (String fn, String ln, int sqrf, float dwell, float con, float liab){
            name = fn + " " + ln;
            sqrfoot = sqrf;
            dwelling = dwell;
            contents = con;
            liability = liab; 
            saleFormula = (liability * .3f) + (dwelling + contents) * .2f;
      }
      //no arg constructor
      public Home (){
            name = " ";
            oneName = " ";
            twoName = " ";
            sqrfoot = 0;
            dwelling = 0;
            contents = 0;
            liability = 0;
            saleFormula = 0;
      }
            void setFirstName(String fname){
                  oneName = fname;
                  name = oneName + " " + twoName;
            }
            void setLastName(String lname){
                  twoName = lname;
                  name = oneName + " " + twoName;
            }
            public String getName(){
                  return name;
            }
            public String getFirstName(){
                  return oneName;
            }
            public String getLastName(){
                  return twoName;
            }
            void setFootage(int sqft){
                  sqrfoot = sqft;
            } 
            public int getFootage(){
                  return sqrfoot;
            }     
            void setDwelling(float dwell){
                  dwelling = dwell;
            }
            public float getDwelling(){
                  return dwelling;
            }
            void setContents(float cont){
                  contents = cont; 
            }
            public float getContents(){
                  return contents;
            }
            void setLiability(float liab){
                  liability = liab; 
            }
            public float getLiability(){
                  return liability;
            }
            public float computeCommission(){
                  return saleFormula;
            } 

}   
