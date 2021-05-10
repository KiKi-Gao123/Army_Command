package cn.com.army.command;
//10<=敌人<50,排长决定
public class paizhang extends Officer{
    public paizhang(String name){
        super(name);
    }

    public void handleRequest(Mission request){
        if (request.getEnenyNumbers()>=10&&request.getEnenyNumbers()<50){
            System.out.println("排长"+name+"发现敌人数量为"+request.getEnenyNumbers()+"下达作战命令");
        }else {
            if (this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
