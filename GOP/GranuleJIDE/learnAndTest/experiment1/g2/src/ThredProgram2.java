import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

public class ThredProgram2 extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");

        System.out.println("ThredProgram2:"+String.valueOf(Thread.currentThread().getId()));

        GopContext.createThredProgram(this.getId(), this.getName());

        BaseClass baseClass = new BaseClass();

        // �޸������� + ִ�з���
        GopContext.modifyContext("context", "value2", "public", this.getId());
        baseClass.executeMethod(this.getName(), "first time");


        // �޸������� + ִ�з���
        GopContext.modifyContext("context", "value1", "public", this.getId());

        baseClass.executeMethod(this.getName(), "second time");

    }
}
