public class FinalDemo2{
	private final int x;
	private int y;
	public FinalDemo2(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	/*
	//�����߻� final ������ ����Ұ�
	public void setX(){
		this.x = x;
	}
	*/
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
}