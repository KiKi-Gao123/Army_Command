package cn.com.army.command;
//抽象领导者
public abstract class Officer {
    protected String name;
    protected Officer successor;
    public Officer(String name){
        this.name=name;
    }
    public void setSuccessor(Officer successor){
        this.successor=successor;
    }

    public abstract void handleRequest(Mission request);
}
