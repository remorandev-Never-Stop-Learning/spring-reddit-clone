package dev.remoran.clone.reddit.repository;

import dev.remoran.clone.reddit.model.Comment;
import dev.remoran.clone.reddit.model.Post;
import dev.remoran.clone.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
