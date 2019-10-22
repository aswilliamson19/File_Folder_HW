package com.codeclan.FileFolderHomework.respositories;

import com.codeclan.FileFolderHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FileRepository extends JpaRepository<File, Long> {
}
