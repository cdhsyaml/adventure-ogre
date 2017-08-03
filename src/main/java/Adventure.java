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
        return "Test death.";
    }




}
