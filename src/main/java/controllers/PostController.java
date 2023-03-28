package controllers;

import model.Post;
import org.springframework.web.bind.annotation.*;
import dto.requests.PostCreateRequest;
import dto.requests.PostUpdateRequest;
import dto.responses.PostResponse;
import services.PostService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostResponse> getAllPost(@RequestParam Optional<Long> userId) {
        return postService.getAllPost(userId);
    }

    @GetMapping("/{postId}")
    public PostResponse getOnePost(@PathVariable Long postId) {
        return postService.getOnePostByIdWithLikes(postId);
    }

    @PostMapping
    public Post createOnePost(@RequestBody PostCreateRequest newPostRequest){
        return postService.createOnePost(newPostRequest);
    }

    @PutMapping("/{postId}")
    public Post updateOnePost(@PathVariable Long postId, @RequestBody PostUpdateRequest updatePost){
        return postService.updateOnePostById(postId, updatePost);
    }

    @DeleteMapping("/{postId}")
    public void deleteOnePost(@PathVariable Long postId){
        postService.deleteOnePostById(postId);
    }
}
