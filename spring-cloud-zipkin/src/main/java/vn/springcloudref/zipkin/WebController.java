/*
 * Class: WebController
 *
 * Created on Mar 24, 2022
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package vn.springcloudref.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired 
    RestTemplate restTemplate;
    
    @GetMapping("/")
    public String helloWorld() {
        String response = restTemplate.getForObject("http://localhost:8082/test", String.class);
        return "<h1>Hello from the " + response + "!</h1>";
    }

}