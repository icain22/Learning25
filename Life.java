public class Life {
String name;
int age;
float lifeTerm;
float saleCom; 
//constructor
public Life (String fn, String ln, int ag, float lifet){
      name = fn + " " + ln;
      age = ag;
      lifeTerm = lifet;
      saleCom = lifeTerm * .2f;
}
public void setFirstName(String fname){
      name = fname; 
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
public void setLastName(String lname){
      name = lname; 
}
public void setAge(int ag){
      age = ag;
}
public int getAge(){
      return age;
}
public void setTerm(float lifet){
      lifeTerm = lifet;
}
public float getTerm(){
      return lifeTerm;
}
public float computeCommission(){
      saleCom = lifeTerm * .2f;
      System.out.println(saleCom);
      return saleCom;
}
}
