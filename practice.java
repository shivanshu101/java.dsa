import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class practice{
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <= n; i++){\
            // space
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}