package responses;

import lombok.Data;
import model.Post;

@Data
public class PostResponse {

    Long id;

    Long userId;

    String userName;

    String text;

    String title;

    public PostResponse(Post entity){
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.text = entity.getText();
        this.title = entity.getTitle();
    }
}
