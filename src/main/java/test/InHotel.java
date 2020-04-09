package test;

public class InHotel {
	
	private int room;
	MainRun mr = new MainRun();
	public String in(int roomNo,String name) {
		
		room = (roomNo%100)-1;
		if(isEmpty(roomNo)) {
			System.out.println(room);
			mr.getRoom()[(roomNo/100)][room] = name;
			return name+"成功入住"+roomNo+"房间!";
		}else {
			return "该房间已经有客人入住";
		}
	}
	
	public boolean isEmpty(int roomNo) {
		String room = mr.getRoom()[(roomNo/100)][(roomNo%100)-1];
		
		if("EMPTY".equals(room)) {
			return true;
		}else {
			return false;
		}
	}
}
