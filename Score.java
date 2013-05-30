//tentative scoring class, needs to be attached to stuff
public class Score{

  private int _score;
  
  public Score(){
  _score = 0;  
  }
  
  public int getScore(){
   return _score;
  }
  
  public void add(){
    _score++;
  }
 
  public void subtract(){
   _score--; 
  }
  
}
