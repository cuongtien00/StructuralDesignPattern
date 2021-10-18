package facade;

public class Main {
    public static void main(String[] args) {
        SocialMediaShare socialMediaShare = new SocialMediaShare(new Facebook(),new Twitter(),new LinkedIn());
        socialMediaShare.share("Hom nay la ngay dau tien hoc tai codegym");
    }
}
