public class Contestant{

    private String _name;
    private Score _myScore;
    private int _numRounds;

    public Contestant(){
    _name = "Bob";
	_myScore = new Score();
	_numRounds = 0;
    }

    public Contestant(String name){
	this();
	_name = name;
    }
    
    public int getScore(){
	   return _myScore.getScore();
    }

    public void addScore(){ 
    	_myScore.add();
    }

    public void subtractScore(){
    	_myScore.subtract();
    }
    
    public String getName(){ 
    	return _name;
    }

    public int getNumRounds(){
	return _numRounds;		
    }

    public void setNumRounds(int num){
        _numRounds = num;
    }	

    public String changeName(String newName){
	String temp = _name;
	_name = newName;
	return temp;
    }
}
