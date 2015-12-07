package Demo2;

import java.util.ArrayList;


public class SearchHistory extends AnyLog{

	public void addHistory(String s){
		super.addElementLog(s);
	}
	public String printHistory(){
		return super.printLog();
	}
}
