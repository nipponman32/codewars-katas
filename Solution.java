import java.lang.Math;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class Solution {
  public static int zeros(int n) {
    int z=0;
    for(int k=1;k<log5(n);k++){
      z += n/Math.pow(5,k);
    }
    
    return z;
  }
  
  public static double log5(int t){
    return Math.log((double)t)/Math.log(5.0);
  }
  
  @Test
  public static void main(String[] args){
      assertThat(Solution.zeros(0), is(0)); 
    assertThat(Solution.zeros(6), is(1)); 
    assertThat(Solution.zeros(14), is(2));    
  }
}
