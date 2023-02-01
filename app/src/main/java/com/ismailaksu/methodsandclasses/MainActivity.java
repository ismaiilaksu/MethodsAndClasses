package com.ismailaksu.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("it is a"));
        username = "";
        makeMusicians();
        makeAccessibility();
    }

    public void makeAccessibility() {
        Accessibility Ismail = new Accessibility("ismail", 23, "Student");
        System.out.println(Ismail.getName());
        Ismail.setName("ismail Aksu");
        System.out.println(Ismail.getName());
    }

    public void makeMusicians() {

        //Instance

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
    }

    public int math(int a , int b ) {
        username = "aksu";
        return a + b;
    }

    public void testMethod() {
        username = "ankara";
        int x = 4 + 4 ;
        System.out.println("value of x: "+x);
    }

    public String newMethod(String string) {

        return string + " new method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");

    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");

    }
}