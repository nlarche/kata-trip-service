package trip;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import user.User;

class TripServiceTest {

  @Test
  public void testGetTripsByUser(){
    var loggedUser = new User();
    var user = new User(List.of(loggedUser));

    var userSession = new UserSessionStub(loggedUser);
    var tripRepository = new TripRepositoryStub();

    var service = new TripService(userSession, tripRepository);
    var trips = service.getTripsByUser(user);
    assertEquals(trips.size(), 1);
  }

}