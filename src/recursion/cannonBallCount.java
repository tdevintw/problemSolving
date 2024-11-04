/*
 * Problem: Calculate the total number of cannonballs in a stack where each level has
 * an increasing number of cannonballs (1 on the first level, 2 on the second, etc.).
 *
 * Example:
 * Input: levels = 3
 * Output: 6 (1 + 2 + 3)
 */


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
