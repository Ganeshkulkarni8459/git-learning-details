package org.dnyanyog.services;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Service;

@Service
public class AddUserService {
    public AddUserResponse addUser(AddUserRequest addUserRequest) {

        AddUserResponse response = new AddUserResponse();

        if (addUserRequest.getAction().equalsIgnoreCase("AddUser") &&
                addUserRequest.getUser_id().equals("123") &&
                addUserRequest.getUser_name().equalsIgnoreCase("John Doe") && // Fixed method call
                addUserRequest.getUser_email().equalsIgnoreCase("john.doe@example.com") &&
                addUserRequest.getUser_age().equals("28")) {

            response.setStatus("success");
            response.setMessage("User successfully added"); // Changed attribute name to setMessage
            response.setUser_name("John Doe"); // Set specific attributes using respective setters
            response.setUser_id("123");
            response.setUser_email("john.doe@example.com");
            response.setUser_age("28");
        } else {
            response.setStatus("Failed");
            response.setMessage("User Not Found!!!!.."); // Changed attribute name to setMessage
        }
        return response;
    }
}


