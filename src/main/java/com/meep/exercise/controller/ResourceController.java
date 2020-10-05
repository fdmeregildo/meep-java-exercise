package com.meep.exercise.controller;

import com.meep.exercise.bean.Resource;
import com.meep.exercise.bean.ResourceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
public class ResourceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Flux<ResourceStatus> getResourcesStatus(){

        Flux<ResourceStatus> resourceStatusFlux = null;

        return resourceStatusFlux;
    }

    @GetMapping("/resources")
    public Flux<List<Resource>> getAllResources() {

        //WebClient client = WebClient.create("https://apidev.meep.me");

        /*
        Flux<Resource> result = client.get().uri(uriBuilder -> uriBuilder.path("/tripplan/api/v1/routers/lisboa/resources")
                .queryParam("lowerLeftLatLon", "38.711046,-9.160096")
                .queryParam("upperRightLatLon", "38.739429,9.137115")
                .queryParam("companyZoneIds", "545,467,473").build())
                .retrieve()
                .bodyToFlux(Resource.class).delayElements(Duration.ofSeconds(90));

        result.subscribe(this::imprimirResource);
        */

        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
        interval.subscribe();

        return interval;
    }

    private void imprimirResource(Resource resource){
        System.out.println(resource.toString());
    }

    private List<Resource> getListResource(){
        System.out.println("Testing..");
        List<Resource> list = restTemplate.getForObject("https://apidev.meep.me/tripplan/api/v1/routers/lisboa/resources?\n" +
                "lowerLeftLatLon=38.711046,-9.160096&upperRightLatLon=38.739429,9.137115&companyZoneIds=545,467,473", List.class);

        return list;
    }
}
