package models;


import com.sun.istack.internal.NotNull;

/**
 * Represents a follow relationship.
 */
public class Follow {

    private final User follower;
    private final User followee;

    public Follow(@NotNull User follower, @NotNull User followee) {
        this.follower = follower;
        this.followee = followee;
    }

    public User getFollower() {
        return follower;
    }

    public User getFollowee() {
        return followee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Follow that = (Follow) o;
        return follower.equals(that.follower) &&
                followee.equals(that.followee);
    }


    @NotNull
    @Override
    public String toString() {
        return "Follow{" +
                "follower=" + follower.getAlias() +
                ", followee=" + followee.getAlias() +
                '}';
    }
}
