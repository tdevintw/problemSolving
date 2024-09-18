package recursion;
public class cannonBallCount {
    public static long countCannonBall(int layers) {
        if (layers == 0) {
            return 0;
        } else if (layers == 1) {
            return 1;
        }else{
            return PowerCalculation.powerCalculation(2,layers-1)+ countCannonBall(layers-1);
        }
    }
}
