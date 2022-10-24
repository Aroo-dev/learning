package OOP.oncemore;

import OOP.oncemore.drive.Drive;
import OOP.oncemore.usbDevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    ;
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;
    private List<USBDevice> usbDevice =  new ArrayList<>();

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public List<USBDevice> getUsbDevice() {
        return usbDevice;
    }
    public void addUSBDevice(USBDevice usbDevice){
         boolean isConnected = usbDevice.connect();
         if (isConnected){
             this.usbDevice.add(usbDevice);
         }
    }
    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();

        if (isDisconnected) {

            this.usbDevice.remove(usbDevice);
        }
    }
}
