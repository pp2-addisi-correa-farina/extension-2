package time;

import java.time.LocalDateTime;

public class ProdLocalTimeService implements LocalTimeService {
    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
