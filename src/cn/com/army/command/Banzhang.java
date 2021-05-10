package cn.com.army.command;
//<10,班长决定
public class Banzhang extends Officer{
    public Banzhang(String name){
        super(name);
    }

    public void handleRequest(Mission request){
        if (request.getEnenyNumbers()<10){
            System.out.println("班长"+name+"发现敌人数量为"+request.getEnenyNumbers()+"下达作战命令");
        }else {
            if (this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
