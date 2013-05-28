//tentative scoring class, needs to be attached to stuff
public class Score{

  private Integer _score;
  
  public Score(){
  _score = 0;  
  }
  
  public getScore(){
   return _score;
  }
  
  public add(){
    _score++;
  }
 
  public subtract(){
   _score--; 
  }
  
}
