package trip;

import exception.CollaboratorCallException;
import java.util.List;
import user.User;

public class TripDAO implements TripRepository {

  public List<Trip> findTripsByUser(User user) {
    throw new CollaboratorCallException(
        "TripDAO should not be invoked on an unit test.");
  }

}