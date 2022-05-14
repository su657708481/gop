import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

public class ThredProgram2 extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");

        BaseClass baseClass = new BaseClass();

        // 修改上下文 + 执行方法
        GopContext.modifyContext("context", "value2", "public", this.getName());
        baseClass.executeMethod(this.getName());


        // 修改上下文 + 执行方法
        GopContext.modifyContext("context", "value1", "public", this.getName());

        baseClass.executeMethod(this.getName());

    }
}
