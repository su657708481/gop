import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

public class ThredProgram2 extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");
        GopContext.createThredProgram(this.getId(), this.getName());

        BaseClass baseClass = new BaseClass();

        // 修改上下文 + 执行方法
        GopContext.modifyContext("context", "value2", "public", this.getId());
        baseClass.executeMethod(this.getName(), "first time");


        // 修改上下文 + 执行方法
        GopContext.modifyContext("context", "value1", "public", this.getId());

        baseClass.executeMethod(this.getName(), "second time");

    }
}
