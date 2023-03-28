package dto.responses;

import lombok.Data;
import model.User;

@Data
public class UserResponse {

    Long id;
    int avatarId;
    String userName;

    public UserResponse(User entity){
        this.id = entity.getId();
        this.avatarId = entity.getAvatar();
        this.userName = entity.getUserName();
    }
}
