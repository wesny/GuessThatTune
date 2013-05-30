public class Contestant{

    private String _name;
    private Score _myScore;
    private int _numRounds;

    public Contestant(){
        _name = "bob";
	_myScore = new Score();
	_numRounds = 0;
    }

    public Contestant(String name){
	this();
	_name = name;
    }
    
    public Score getScore(){
	return _myScore;
    }

    public Score addScore(){ 
    	return _myScore.add();
    }

    public Score subtractScore(){
    	return _myScore.subtract();
    }
    
    public String getName(){ 
    	return _name;
    }

    public int getNumRounds(){
	return _numRounds;		
    }	


    public String changeName(String newName){
	String temp = _name;
	_name = newName;
	return temp;
    }
}
