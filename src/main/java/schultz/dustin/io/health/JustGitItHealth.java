package schultz.dustin.io.health;

import com.justgifit.JustGitItProperties;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import javax.inject.Inject;

@Component
public class JustGitItHealth implements HealthIndicator {
    @Inject
    private JustGitItProperties gitItProperties;

    @Override
    public Health health() {
        if(!gitItProperties.getGifLocation().canWrite()){
            return Health.down().build();
        };
        return Health.up().build();
    }
}
