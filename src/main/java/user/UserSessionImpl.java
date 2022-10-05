package user;

import exception.CollaboratorCallException;

public class UserSessionImpl implements UserSession {


	@Override
	public User getLoggedUser() {
		throw new CollaboratorCallException(
				"UserSession.getLoggedUser() should not be called in an unit test");
	}

}
