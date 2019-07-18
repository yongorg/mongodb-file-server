package com.waylau.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.waylau.spring.boot.fileserver.domain.File;
 

/**
 * File 存储库.
 *
 * @author yongz
 * @date 2019年1月26日
 */
public interface FileRepository extends MongoRepository<File, String> {
}
