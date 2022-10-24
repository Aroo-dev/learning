package OOP.oncemore.usbDevice;

public class MemoryStick implements USBDevice{
    private String name;

    public MemoryStick(String name) {
        this.name = name;
    }

    private boolean ejected = false;
    @Override
    public boolean connect() {
        System.out.println("connected memory stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected){
            System.out.println("please eject memory stick first");

        } else{
            System.out.println("memory stick disconnected");
        }
        return true;
    }
    public void eject(){
        System.out.println("ejecting memory stick");
        ejected = true;
    }

    @Override
    public String getName() {
        return getName();
    }
}
