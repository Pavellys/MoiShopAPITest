package object;

import com.google.gson.annotations.Expose;
import lombok.Data;

import java.util.List;

@Data
public class ListDataForGroups {
    @Expose
    String status;
    @Expose
    List<GroupData> groups;
    @Expose
    List<GroupData> group;
}
