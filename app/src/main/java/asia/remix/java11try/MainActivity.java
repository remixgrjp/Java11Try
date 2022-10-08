package asia.remix.java11try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
	@Override
	protected void onCreate( Bundle savedInstanceState ){
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		int i = 0x20BB7;//surrogate pair Unicode
		String str = java.lang.Character.toString( i );//Java 11

	}
}