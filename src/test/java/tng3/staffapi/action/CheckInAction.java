package tng3.staffapi.action;

import io.restassured.http.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tng3.base.APIResponse;
import tng3.base.Action;
import tng3.helper.RequestHelper;

import java.util.HashMap;

@Component
public class CheckInAction extends Action {

    final private String endpoint = "/staffapi/checkin";



    public APIResponse checkInGuest(String cardId){
        HashMap<String, String> additional = new HashMap<>();
            additional.put("client", cardId);
        return requestHelper.go(endpoint, Method.POST, null, additional);
    }


    @Autowired private RequestHelper requestHelper;
}
