package org.superbiz.moviefun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.superbiz.moviefun.albumsapi.AlbumsClient;
import org.superbiz.moviefun.moviesapi.MoviesClient;

@Configuration
public class ClientConfiguration {

   // @Value("${albums.url}") String albumsUrl;
   // @Value("${movies.url}") String moviesUrl;

    @Bean
    @LoadBalanced
    public AlbumsClient albumsClient(RestOperations restOperations) {
        return new AlbumsClient("//album-service/albums", restOperations);
    }

    @Bean
    @LoadBalanced
    public MoviesClient moviesClient(RestOperations restOperations) {
        return new MoviesClient("//movie-service/movies", restOperations);
    }
}
