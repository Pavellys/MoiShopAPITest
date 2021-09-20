package object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ListUsersData {
    @Expose
    String status;
    @SerializedName("users_in_group")
    @Expose
    List<UserData> usersInGroup;
}
