package OOP.oncemore.drive;

import OOP.oncemore.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive{
    private List<File> file = new ArrayList<>();



    @Override
    public void listFiles() {
       for (File files: file){
           System.out.println(files.getName());
       }
    }

    @Override
    public File findFile(String name) {
        Optional <File> foundFile = file.stream().filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }

    @Override
    public void addFiles(File file) {
        this.file.add(file);
    }

}
