package tng3.staffapi.action;

import io.restassured.http.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tng3.base.APIResponse;
import tng3.base.Action;
import tng3.helper.RequestHelper;

import java.util.HashMap;

@Component
public class ClientAction extends Action {

    final private String endpoint = "/staffapi/clients";



    public APIResponse getClients(){
        return requestHelper.go(endpoint, Method.GET, null, null);
    }


    @Autowired private RequestHelper requestHelper;
}