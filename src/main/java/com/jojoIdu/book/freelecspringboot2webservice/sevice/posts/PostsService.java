package com.jojoIdu.book.freelecspringboot2webservice.sevice.posts;

import com.jojoIdu.book.freelecspringboot2webservice.domain.posts.Posts;
import com.jojoIdu.book.freelecspringboot2webservice.domain.posts.PostsRepository;
import com.jojoIdu.book.freelecspringboot2webservice.web.dto.PostsResponseDto;
import com.jojoIdu.book.freelecspringboot2webservice.web.dto.PostsSaveRequestDto;
import com.jojoIdu.book.freelecspringboot2webservice.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).
                getId();

    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+ id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }


}
