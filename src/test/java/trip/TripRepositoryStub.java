package trip;

import java.util.List;
import trip.Trip;
import trip.TripRepository;
import user.User;

public class TripRepositoryStub implements TripRepository {

  @Override
  public List<Trip> findTripsByUser(User user) {
    return List.of(new Trip());
  }

}
