# Animation Tester

Test and see that your moves are good. :wink:

## Introduction

This is a simple utility application that allows one to test Android animations before using them in a production app.

## How To Use

1. Clone this repository.
2. Replace the animations for coming in and leave from the left and coming in and leaving from the right with your own.
3. Replace the string values of the animations with names of the animations.
4. In the ```java onCreate``` of ``` java MainActivity``` there is a list of animations of the class ```java AnAnimation```. This class contains the name of a particular animation and the inflated value of that animation. The name will reference the string values set in step 3. For the inflated animation, please input the resource ID of the animation you would like to test.
5. Run the app. :smile: 
6. The animations will be in the "More" app bar button. The app will animate ```java "Hello World!"``` using the animations in "More".

## Abilities :muscle:

As of Tuesday, May 24, 2016, the app currently supports:
* [Tween animations] (https://developer.android.com/guide/topics/resources/animation-resource.html#Tween).

## Limitations :sad:

As of Tuesday, May 24, 2016, the app currently fails in the following:
* No [property animations] (https://developer.android.com/guide/topics/graphics/prop-animation.html).


## Possible Future Work

These might be:
- [ ] Support property animations.

## License

This repository is licensed under the [GNU General Public License Version 3](http://www.gnu.org/licenses/gpl-3.0.en.html).
