external public String context = "value1";

public class Main{

    public static void main(String[] args) {

        
        Long id=Thread.currentThread().getId();

        System.out.println("MAIN:"+String.valueOf(id));


        ThredProgram1 program1 = new ThredProgram1();

        program1.setName("ThredProgram1");

        program1.start();


        ThredProgram2 program2 = new ThredProgram2();

        program2.setName("ThredProgram2");

        program2.start();

    }

}
