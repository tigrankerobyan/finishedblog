package com.example.blog.persistance.repository;

import com.example.blog.persistance.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByArticle_Id(Long articleID);
}
