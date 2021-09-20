package object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class GroupData {
    @Expose
    int id;
    @Expose
    String name;
    @Expose
    String description;
    @Expose
    String created;
    @Expose
    String updated;
    @SerializedName("updated_by")
    @Expose
    int updatedBy;
}
