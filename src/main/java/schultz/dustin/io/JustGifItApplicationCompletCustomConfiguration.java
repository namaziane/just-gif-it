package schultz.dustin.io;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration;
import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;
import java.io.File;

@Configuration
@Import(HealthIndicatorAutoConfiguration.class)
public class JustGifItApplicationCompletCustomConfiguration {

    public static void mainForFullyCustomConfiguration(String[] args) {
        SpringApplication.run(JustGifItApplicationCompletCustomConfiguration.class, args);
    }


}
