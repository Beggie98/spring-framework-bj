package dono.daryo.proxy;

import dono.daryo.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
