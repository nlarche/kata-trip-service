package trip;

import user.User;
import user.UserSession;

public class UserSessionStub implements UserSession {

  private final User loggedUser;

  public UserSessionStub(User loggedUser) {
    this.loggedUser = loggedUser;
  }

  @Override
  public User getLoggedUser() {
    return loggedUser;
  }
}
