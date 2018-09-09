package com.reactive.test;

import lombok.val;
import lombok.var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Test
    public void contextLoads() {
        var peter = new UserModel("Peter", "Griffin");
        var lois = new UserModel("Lois", "Griffin");
        var brain = new UserModel("Brain", "Griffin");

        val peterMono = Mono.just(peter);

    }

}
