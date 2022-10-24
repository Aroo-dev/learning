package OOP.oncemore.drive;

import OOP.oncemore.file.File;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


public class ArosFile implements Drive {
    private List< File> aroFile = new LinkedList<>();
    @Override
    public void addFiles(File file) {
       aroFile.add(file);


    }

    @Override
    public void listFiles() {
        for (int i = 0; i < aroFile.size(); i++) {
            System.out.println(aroFile.get(i).getName());

        }
        }


    @Override
    public File findFile(String name) {
        Optional<File> foundFile = aroFile.stream().filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }
}
