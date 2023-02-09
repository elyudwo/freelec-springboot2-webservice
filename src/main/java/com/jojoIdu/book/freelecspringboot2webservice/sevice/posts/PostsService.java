package com.jojoIdu.book.freelecspringboot2webservice.sevice.posts;

import com.jojoIdu.book.freelecspringboot2webservice.domain.posts.PostsRepository;
import com.jojoIdu.book.freelecspringboot2webservice.web.dto.PostsSaveRequestDto;
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
}
