package test;

import java.util.List;
import java.util.Map;

public class TransportationWalk {
	
	String walkName = null;
	String walkPlace = null;
	
	List walkList = null;
	
	Map walkMap = null;

	public TransportationWalk() {
		System.out.println("CREATE TransportationWalk...1");
	}
	
	public TransportationWalk(String walkName,String walkPlace) {
		System.out.println("CREATE TransportationWalk...2");
		this.walkName = walkName;
		this.walkPlace = walkPlace;
	}
	
	
	public void setWalkList(List walkList) {
		System.out.println("setWalkList start");
		this.walkList = walkList;
	}

	public void setWalkMap(Map walkMap) {
		System.out.println("setWalkMap start");
		this.walkMap = walkMap;
	}

	public void setWalkName(String walkName) {
		System.out.println("setWalkName start");
		this.walkName = walkName;
	}

	public void setWalkPlace(String walkPlace) {
		System.out.println("setWalkPalce start");
		this.walkPlace = walkPlace;
	}

	public void move() {
		System.out.println(walkName);
		System.out.println(walkPlace);
		
		
		if(walkList != null) {
			for(int i=0;i<walkList.size();i++) {
				System.out.println(i + " 번째 value : " + walkList.get(i));
			}
		}
		
		System.out.println(walkMap.get("1"));
		System.out.println(walkMap.get("2"));
		System.out.println(walkMap.get("3"));
		System.out.println(walkMap.get("4"));
	}
}