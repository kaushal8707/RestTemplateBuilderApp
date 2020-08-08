package com.always.learner.RestTemplateBuilderApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MainController
{
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("userList")
    List<User> getUserList()
    {
        return restTemplate.getForObject("/users_data",List.class);
    }
    @GetMapping("user_d")
    String getUser()
    {
        return restTemplate.getForObject("/userdata/2",String.class);
    }
}
