package dev.remoran.clone.reddit.repository;

import dev.remoran.clone.reddit.model.Post;
import dev.remoran.clone.reddit.model.User;
import dev.remoran.clone.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
