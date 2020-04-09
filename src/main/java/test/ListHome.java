package test;

public class ListHome {
	MainRun mr = new MainRun();
	public void search() {
		//打印房间号
		for(int i=0;i<mr.getRoom().length;i++) {
			for(int j=0;j<mr.getRoom()[0].length;j++) {
				if(j+1<10) {
					System.out.println(i+1+"0"+(j+1)+"");
				}else {
					System.out.println(i+1+""+(j+1)+"");
				}		
			}
			//打印房间状态
			System.out.println();
			for(int j=0;j<mr.getRoom()[0].length;j++) {
				System.out.println(mr.getRoom()[i][j]+"	");
			}
			System.out.println();
		}
	}
}
