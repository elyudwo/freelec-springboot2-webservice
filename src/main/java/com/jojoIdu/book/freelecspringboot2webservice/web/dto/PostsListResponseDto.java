package com.jojoIdu.book.freelecspringboot2webservice.web.dto;

import com.jojoIdu.book.freelecspringboot2webservice.domain.posts.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;

    public PostsListResponseDto(Post entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }

}