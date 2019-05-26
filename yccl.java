class No extends Exception{
	public No(){
		super();
	}
	public No(String message){
		super(message);
	}
}
class test{
	public void play(int index)throws No{
		if(index>10){
			throw new No("格式错误异常");
		}
		System.out.println("正在正常运行");
	}
}
public class yccl {
	public static void main(String[] args) {
		test test = new test();
		try {
			test.play(13);
		} catch (No e) {
			System.out.println("异常信息为： "+e.getMessage());
		}
	}
}
