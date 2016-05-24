package com.jlt.animationtester;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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

// begin class AnAnimation
public class AnAnimation {

    /** CONSTANTS */

    /** VARIABLES */

    /** Animations */

    private Animation animation; // the animation

    /** Strings */

    private String name; // the name of the animation

    /** CONSTRUCTOR */

    // begin constructor
    public AnAnimation( String name, Context context,  int animationResourceID ) {

        setName( name );

        setAnimation( context, animationResourceID );

    } // end constructor

    /** METHODS */

    /** Getters and Setters */

    // getter for the animation
    public Animation getAnimation() { return animation; }

    // setter for the animation using an animation
    private void setAnimation( Animation animation ) { this.animation = animation; }

    // setter for the animation using an animation resource
    private void setAnimation( Context context, int animationResourceID ) { setAnimation( AnimationUtils.loadAnimation( context, animationResourceID ) ); }

    // getter for the name
    public String getName() { return name; }

    // setter for the name
    private void setName( String name ) { this.name = name; }

    /** Overrides */

    /** Other Methods */

} // end class AnAnimation