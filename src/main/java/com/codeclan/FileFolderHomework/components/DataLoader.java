package com.codeclan.FileFolderHomework.components;

import com.codeclan.FileFolderHomework.models.File;
import com.codeclan.FileFolderHomework.models.Folder;
import com.codeclan.FileFolderHomework.models.User;
import com.codeclan.FileFolderHomework.respositories.FileRepository;
import com.codeclan.FileFolderHomework.respositories.FolderRepository;
import com.codeclan.FileFolderHomework.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){

        User user1 = new User("Sara");
        userRepository.save(user1);

        User user2 = new User("Dave");
        userRepository.save(user2);

        Folder folder1 = new Folder("Paired Labs", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Journal", user2);
        folderRepository.save(folder2);

        File file1 = new File("Day1", ".ppt", 23, folder2);
        fileRepository.save(file1);

        File file2 = new File("Pirate service", ".java", 23, folder1);
        fileRepository.save(file1);

        File file3 = new File("Travel bucket list", ".rb", 50, folder1);
        fileRepository.save(file3);



    }
}
