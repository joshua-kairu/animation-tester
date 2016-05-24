package com.jlt.animationtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Animation Tester
 *
 * Utility project to test Android animations
 *
 * Copyright (C) 2016 Kairu Joshua Wambugu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 */

// begin class MainActivity
public class MainActivity extends AppCompatActivity {

    /** CONSTANTS */

    /** VARIABLES */

    /* An Animations */

    private AnAnimation

    leftArrivingAnimation, // the animation for arriving from the left
    leftLeavingAnimation, // the animation for leaving to the left
    rightArrivingAnimation, // the animation for arriving from the right
    rightLeavingAnimation; // the animation for leaving to the right

    /** Text Views */

    private TextView helloWorldTextView; // the hellow world text view

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_main );

        // 0. initialize the text view
        // 1. initialize the animations

        // 0. initialize the text view

        helloWorldTextView = ( TextView ) findViewById( R.id.am_tv );

        // 1. initialize the animations

        leftArrivingAnimation = new AnAnimation( getString( R.string.animation_left_arriving ), this, R.anim.slide_from_left_and_grow );
        leftLeavingAnimation = new AnAnimation( getString( R.string.animation_left_leaving ), this, R.anim.shrink_and_leave_to_left );
        rightArrivingAnimation = new AnAnimation( getString( R.string.animation_right_arriving ), this, R.anim.slide_from_right_and_grow );
        rightLeavingAnimation = new AnAnimation( getString( R.string.animation_right_leaving ), this, R.anim.shrink_and_leave_to_right );

    } // end onCreate

    @Override
    // begin onCreateOptionsMenu
    public boolean onCreateOptionsMenu( Menu menu ) {

        // 0. inflate the options menu
        // 1. super things

        // 0. inflate the options menu

        getMenuInflater().inflate( R.menu.menu_main, menu );

        // 1. super things

        return super.onCreateOptionsMenu( menu );

    } // end onCreateOptionsMenu

    @Override
    // begin onOptionsItemSelected
    public boolean onOptionsItemSelected( MenuItem item ) {

        // 0. if the left arriving option is selected
        // 0a. animate left arriving
        // 1. if the left leaving option is selected
        // 1a. animate left leaving
        // 2. if the right arriving option is selected
        // 2a. animate right arriving
        // 3. if the right leaving option is selected
        // 3a. animate right leaving
        // 4. otherwise
        // 4a. super things

        // begin switch to determine what to do
        switch ( item.getItemId() ) {

            // 0. if the left arriving option is selected

            case R.id.action_animation_left_arriving:

                // 0a. animate left arriving

                helloWorldTextView.startAnimation( leftArrivingAnimation.getAnimation() );

                return true;

            // 1. if the left leaving option is selected

            case R.id.action_animation_left_leaving:

                // 1a. animate left leaving

                helloWorldTextView.startAnimation( leftLeavingAnimation.getAnimation() );

                return true;

            // 2. if the right arriving option is selected

            case R.id.action_animation_right_arriving:

                // 2a. animate right arriving

                helloWorldTextView.startAnimation( rightArrivingAnimation.getAnimation() );

                return true;

            // 3. if the right leaving option is selected

            case R.id.action_animation_right_leaving:

                // 3a. animate right leaving

                helloWorldTextView.startAnimation( rightLeavingAnimation.getAnimation() );

                return true;

            // 4. otherwise

            default:

                // 4a. super things

                return super.onOptionsItemSelected( item );

        } // end switch to determine what to do

    } // end onOptionsItemSelected

    /** Other Methods */


} // end class MainActivity
