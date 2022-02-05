package iterator.iterators;

import iterator.profile.Profile;
import iterator.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator{
    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contact = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<>
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public void reset() {

    }
}