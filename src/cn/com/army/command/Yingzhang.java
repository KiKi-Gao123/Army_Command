package cn.com.army.command;
//50<=敌人<200,营长决定
public class Yingzhang extends Officer{
    public Yingzhang(String name){
        super(name);
    }

    public void handleRequest(Mission request){
        if (request.getEnenyNumbers()>=50&&request.getEnenyNumbers()<200){
            System.out.println("营长"+name+"发现敌人数量为"+request.getEnenyNumbers()+"下达作战命令");
        }else {
            System.out.println("敌人数量大于200,需要和班长,排长开会讨论再下达作战命令");
            }
        }
    }

