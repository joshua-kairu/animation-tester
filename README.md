# Animation Tester

Test and see that your moves are good. :wink:

## Introduction :point_up:

This is a simple utility application that allows one to test Android animations before using them in a production app.

## How To Use :wrench:

1. Clone this repository.
2. Replace the animations for coming in and leave from the left and coming in and leaving from the right with your own.
3. Replace the string values of the animations with names of the animations.
4. In the ```onCreate``` of ``` MainActivity``` there is a list of animations of the class ```AnAnimation```. 
  This class contains the name of a particular animation and the inflated value of that animation. 
  The name will reference the string values set in step 3. For the inflated animation, please input the resource ID of the animation you would like to test.
5. Run the app. :smile: 
6. The animations will be in the "More" app bar button. The app will animate ```"Hello World!"``` using the animations in "More".

## Abilities :muscle:

As of Tuesday, May 24, 2016, the app currently supports:
* [Tween animations] (https://developer.android.com/guide/topics/resources/animation-resource.html#Tween).

## Limitations :worried:

As of Tuesday, May 24, 2016, the app currently fails in the following:
* No [property animations] (https://developer.android.com/guide/topics/graphics/prop-animation.html).


## Possible Future Work :fast_forward:

These might be:
- [ ] Support property animations.

## License :lock_with_ink_pen:

This repository is licensed under the [GNU General Public License Version 3](http://www.gnu.org/licenses/gpl-3.0.en.html).
