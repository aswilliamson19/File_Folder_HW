package com.codeclan.FileFolderHomework.respositories;

import com.codeclan.FileFolderHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
