package cn.com.army.command;

public class Client {
    public static void main(String[] args) {
        Officer objBanzhang,objpaizhang,objYingzhang;

        objBanzhang = new Banzhang("王建强");
        objpaizhang = new paizhang("刘小强");
        objYingzhang = new Yingzhang("张小虎");

        objBanzhang.setSuccessor(objpaizhang);
        objpaizhang.setSuccessor(objYingzhang);
        objYingzhang.setSuccessor(objBanzhang);

        Mission en1 = new Mission(7);
        objBanzhang.handleRequest(en1);

        Mission en2 = new Mission(33);
        objBanzhang.handleRequest(en2);

        Mission en3 = new Mission(157);
        objBanzhang.handleRequest(en3);

        Mission en4 = new Mission(255);
        objBanzhang.handleRequest(en4);

        
    }
}
