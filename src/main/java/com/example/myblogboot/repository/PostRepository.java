package com.example.myblogboot.repository;

import com.example.myblogboot.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
//    @Modifying
//    @Transactional
//     void addPost();
//     void updatePost();
//     void removePost();
}
