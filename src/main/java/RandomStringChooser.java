import java.util.*;
public class RandomStringChooser
{
 private ArrayList<String> a;
  public RandomStringChooser(String[]b){
    a = new ArrayList<String>();
    for (int i =0; i<b.length; i++){
      a.set(i,b[i]);
    }
  }
  public String getNext(){
    if (a.size()==0){
      return "NONE";
    }
    int rand = (int)(Math.random()*a.size());
    String e = a.get(rand);
    a.remove(rand);
    return e;
  }
}
