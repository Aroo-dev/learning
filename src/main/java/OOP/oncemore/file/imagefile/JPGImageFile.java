package OOP.oncemore.file.imagefile;

public class JPGImageFile extends AbstractImageFile {

    private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name,size);
        this.size = size;

        this.compression = compression;
    }



    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("displaying JPG");
    }

}
