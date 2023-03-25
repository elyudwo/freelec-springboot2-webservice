package com.jojoIdu.book.freelecspringboot2webservice.web.dto;

import com.jojoIdu.book.freelecspringboot2webservice.domain.posts.Post;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Post entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
