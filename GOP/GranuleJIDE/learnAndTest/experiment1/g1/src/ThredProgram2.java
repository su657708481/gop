import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

public class ThredProgram2 extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");
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
