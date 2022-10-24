package OOP.oncemore.file.imagefile;

public class GifImageFile extends AbstractImageFile {


    public GifImageFile(String name, int size) {
      super(name,size);
    }



    public void ShowAnimation(){
        System.out.println("showing funny gif");
    }
}
