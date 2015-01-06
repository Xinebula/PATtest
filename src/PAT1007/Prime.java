package PAT1007;


/**
 * Created by xiny on 2014/12/30.
 */
public class Prime{
    public boolean checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
