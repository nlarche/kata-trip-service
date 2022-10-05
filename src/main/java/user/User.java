package user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import trip.Trip;

public class User {
	private List<User> friends;

	public User() {
		this.friends = new ArrayList<>();
	}

	public User(List<User> friends) {
		this.friends = friends;
	}

	public Boolean isFriends(User user){
		return this.friends.contains(user);
	}

}
