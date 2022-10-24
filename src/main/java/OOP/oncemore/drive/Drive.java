package OOP.oncemore.drive;

import OOP.oncemore.file.File;

public interface Drive {
    void addFiles(File file);
    void listFiles();
    File findFile ( String name);
}
