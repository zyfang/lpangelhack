//package com.example.fang.speakup;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    private TextView categories;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//
//        /*
//         * Using findViewById, we get a reference to our TextView from xml. This allows us to
//         * do things like set the text of the TextView.
//         */
//            categories = (TextView) findViewById(R.id.category_names);
//
//        /*
//         * This String array contains names of classic toys. After all, these are toy apps. We
//         * wanted to create a way to break concepts down into smaller pieces that we thought might
//         * be a little easier to understand. In each lesson, we'll demonstrate new concepts using a
//         * toy app (no, sadly every one won't have ACTUAL toys in it) and then we'll guide you
//         * through adding the functionality that you've just learned by having you use those
//         * concepts in Sunshine! Let us know what you think! We're really excited to have you
//         * taking this course.
//         */
//            String[] categoryNames = ContentLists.getCategoryNames();
//
//        /*
//         * Iterate through the array and append the Strings to the TextView. The reason why we add
//         * the "\n\n\n" after the String is to give visual separation between each String in the
//         * TextView. Later, we'll learn about a better way to display lists of data.
//         */
//            for (String catName : categoryNames) {
//                categories.append(catName + "\n\n\n");
//            }
//    }
//}
