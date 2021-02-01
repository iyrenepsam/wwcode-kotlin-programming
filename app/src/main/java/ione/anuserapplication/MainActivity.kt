package ione.anuserapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Register_click_event(view: View) {
        //Toast.makeText(this,"Hey",Toast.LENGTH_LONG).show()

    var nameEditText=findViewById<EditText>(R.id.name);
        var addressEditText=findViewById<EditText>(R.id.Address);
        var phnumEditText=findViewById<EditText>(R.id.phno);
        var emailEditText=findViewById<EditText>(R.id.email);
        var unameEditText=findViewById<EditText>(R.id.uname);
        var pswdEditText=findViewById<EditText>(R.id.pswd);
        var getname=nameEditText.text.toString();
        var getaddress=addressEditText.text.toString();
        var  getemail=emailEditText.text.toString();
        var getuname=unameEditText.text.toString();
        var getpswd=pswdEditText.text.toString();
        Toast.makeText(this,getname+"\n"+getaddress+" "+getemail,Toast.LENGTH_LONG).show();

    }


    fun Login_click_event(view: View) {}
}



