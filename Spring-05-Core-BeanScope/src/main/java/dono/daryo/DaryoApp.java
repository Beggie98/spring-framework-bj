package dono.daryo;

import dono.daryo.config.ProjectConfig;
import dono.daryo.model.Comment;
import dono.daryo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //CommentService commentService = container.getBean(CommentService.class);
        //commentService.publishComment(comment);

//        CommentService cs1 = container.getBean(CommentService.class);
//        CommentService cs2 = container.getBean(CommentService.class);
//
//        System.out.println(cs1);
//        System.out.println(cs2);
//
//        System.out.println(cs1 == cs2);

    }

}
