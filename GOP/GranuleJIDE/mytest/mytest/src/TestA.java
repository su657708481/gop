public class TestA
{
    public int ax = 10;
    public TestA()
    {
    }
    public void actionA() {}
    public void setAX(int newX) { ax = newX; }
    public int getAX() {System.out.println("TestA:"+hashCode());return ax;}
}
