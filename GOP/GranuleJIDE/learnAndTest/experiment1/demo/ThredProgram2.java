import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

public class ThredProgram2 extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");

        BaseClass baseClass = new BaseClass();

        // �޸������� + ִ�з���
        GopContext.modifyContext("context", "value2", "public", this.getName());
        baseClass.executeMethod(this.getName());


        // �޸������� + ִ�з���
        GopContext.modifyContext("context", "value1", "public", this.getName());

        baseClass.executeMethod(this.getName());

    }
}
