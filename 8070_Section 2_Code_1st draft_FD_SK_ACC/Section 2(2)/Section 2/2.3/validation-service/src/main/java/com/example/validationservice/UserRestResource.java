package com.example.validationservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by magemello on 17/08/2017.
 */
@RepositoryRestResource(path = "user", collectionResourceRel = "user")
interface UserRestResource extends PagingAndSortingRepository<User, Long> {

    public User findByUsername(@Param("username") String username);

}
