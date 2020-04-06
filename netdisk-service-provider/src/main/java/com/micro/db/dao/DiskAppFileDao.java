package com.micro.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.micro.model.DiskAppFile;

public interface DiskAppFileDao extends JpaRepository<DiskAppFile, String>,JpaSpecificationExecutor<DiskAppFile> {

}
