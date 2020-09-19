package dev.remoran.clone.reddit.repository;

import dev.remoran.clone.reddit.model.Post;
import dev.remoran.clone.reddit.model.Subreddit;
import dev.remoran.clone.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
