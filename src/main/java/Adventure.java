/**
 * Created by Guest on 8/3/17.
 */
public class Adventure {

    private String userName;

    public String getDirection() {
        return direction;
    }

    private String direction;
    private String resultOfDirection;

    public Adventure(String userName, String direction, String resultOfDirection){
        this.userName = userName;
        this.direction = direction;
        this.resultOfDirection = resultOfDirection;

    }

    public String resultOfAction() {
        return "Ogre eats you and you die.";
    }


    public String twoNewOptions() {
        return "Do you want to eat the berries? Yes or No?";

    }

    public boolean twoNewOptionsDoDie(String userInput) {

        if (userInput.equals("Yes")){
            return true;
        } else {
            return false;
        }
    }


}
