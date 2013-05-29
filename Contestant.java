public class Contestant{

    private String _name;
    private Score _myScore;

    public Contestant(){
        _name = "bob";
	_myScore = new Score();
    }

    public Contestant(String name){
	_name = name;
	_myScore = new Score();
    }
    
    public Score getScore(){
	return _myScore;
    }

    public Score addScore(){ return _myScore.add();}

    public Score subtractScore(){return _myScore.subtract();}
    
    public String getName(){ return _name;}

    public String changeName(String newName){
	String temp = _name;
	_name = newName;
	return temp;
    }
}
