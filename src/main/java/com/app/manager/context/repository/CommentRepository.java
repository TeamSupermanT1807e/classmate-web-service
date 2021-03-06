package com.app.manager.context.repository;

import com.app.manager.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, String> {
    List<Comment> findAllByPost_idAndStatus
            (String post_id, Comment.StatusEnum status);
    Optional<Comment> findFirstByPost_idAndStatusAndPinEquals
            (String post_id, Comment.StatusEnum status, boolean pin);
    Optional<Comment> findFirstByIdAndStatus
            (String id, Comment.StatusEnum status);
}
