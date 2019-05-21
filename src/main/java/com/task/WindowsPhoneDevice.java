
public class WindowsPhoneDevice extends Device
{
    public WindowsPhoneDevice (String name) { this.name = name; }
    public void getMessage(String msg)
    {
        System.out.println (name + " received Call: " + msg);
    }
}
