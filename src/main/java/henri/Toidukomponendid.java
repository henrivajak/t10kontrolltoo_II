public class Toidukomponendid{
	
	Toiduained t;
	
    double kogus;
	double rasvakogus(){
		if(t==null){return kogus;}
		return kogus*t.rasvadeProtsent;
	}
	
}