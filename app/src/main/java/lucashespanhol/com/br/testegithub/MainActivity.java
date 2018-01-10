package lucashespanhol.com.br.testegithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    private int a;
    private int b;
    private int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    if(a > b){
        c = a + b;
    }
    if(b > a){
        c = a - b;
    }
    if(a == b){
        c = a * b;
    }
}
