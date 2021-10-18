package facade;

public class SocialMediaShare {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialMediaShare(Facebook facebook, Twitter twitter, LinkedIn linkedIn) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
    }
    public void share(String massage){
        facebook.setMassage(massage);
        facebook.share();

        twitter.setMassage(massage);
        twitter.share();

        linkedIn.setMassage(massage);
        linkedIn.share();
    }
}
