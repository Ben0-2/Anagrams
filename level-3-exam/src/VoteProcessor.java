import java.util.ArrayList;

public class VoteProcessor {

public String calculateElectionWinner(ArrayList<String> votes) {
	int votes1 = 0;
	int votes2=0;
	for(int i =0; i<votes.size(); i++) {
		if(votes.get(i).equalsIgnoreCase("pope francis")) {
			votes1+=1;
		}
		else if(votes.get(i).equalsIgnoreCase("edward snowden")) {
			votes2+=1;
		}
	}
	// TODO Auto-generated method stub
	if(votes1>votes2) {
		return "pope francis";
	}else if(votes2>votes1) {
		return "edward snowden";
	}else {
		return "TIE";
	}

}
}
