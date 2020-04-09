package test;

public class OutHotel extends Empty {
	
	IData iData;
	public OutHotel(IData iData) {
		this.iData = iData;
	}
	
	public OutHotel() {}
	
	public String out(int roomNo) {
		return iData.in_out_room(roomNo, "EMPTY");
	}
	/*public String out(int roomNo) {
		MainRun mr = new MainRun();
		if(isEmpty(roomNo)) {
			return "该房间没有人入住，退房失败！";
		}else {
			mr.getRoom()[(roomNo/100)][(roomNo%100)-1] = "EMPTY";
			return "退房成功！";
		}
	}*/
}
