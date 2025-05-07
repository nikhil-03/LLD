package org.example;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    String folderName;
    List<FileSystem> fileSystemList=new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Folder : "+folderName);
        for(FileSystem fileSystem : fileSystemList){
//            System.out.println("-----"+fileSystem);
            fileSystem.ls();
        }
    }
}
