package object;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class ResponseStatus {
    @Expose
    String status;

}
