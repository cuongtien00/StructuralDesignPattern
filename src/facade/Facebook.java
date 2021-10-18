package facade;

public class Facebook implements SocialShare {
    private String massage;
    @Override
    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void share() {
        System.out.println("Sharing in Facebook: "+ massage);

    }
}
