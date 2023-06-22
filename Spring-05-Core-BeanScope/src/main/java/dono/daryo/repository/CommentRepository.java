package dono.daryo.repository;

import dono.daryo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
