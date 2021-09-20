package object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class UserData {
    @Expose
    int id;
    @Expose
    String name;
    @SerializedName("second_name")
    @Expose
    String secondName;
    @SerializedName("middle_name")
    @Expose
    String middleName;
    @Expose
    String gender;
    @Expose
    String birthday;
    @SerializedName("subscribe_to_sms")
    @Expose
    String subscribeToSms;
    @SerializedName("subscribe_to_email")
    @Expose
    String subscribeToEmail;
    @Expose
    String password;
    @Expose
    String created;

}