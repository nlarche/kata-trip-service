package trip;

import java.util.List;
import user.User;

public interface TripRepository {

  List<Trip> findTripsByUser(User user);

}
