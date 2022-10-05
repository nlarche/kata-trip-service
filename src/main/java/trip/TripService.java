package trip;

import exception.UserNotLoggedInException;
import java.util.ArrayList;
import java.util.List;
import user.UserSession;
import user.User;

public class TripService {

  private TripRepository tripRepository;
  private UserSession userSession;

  public TripService(UserSession userSession, TripRepository tripRepository) {
    this.userSession = userSession;
    this.tripRepository = tripRepository;
  }

  public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
    User loggedUser = userSession.getLoggedUser();

    validateLoggedUser(loggedUser);

    boolean isFriend = user.isFriends(loggedUser);
    if (isFriend) {
      return this.tripRepository.findTripsByUser(user);
    }
    return new ArrayList<>();
  }

  private void validateLoggedUser(User loggedUser) {
    if (loggedUser == null) {
      throw new UserNotLoggedInException();
    }
  }

}
