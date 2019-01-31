# FredStat version 1.0.1

This package is a statistics library with some basic statistical operations supporting arrays of doubles in Java.

The sorting function of this library is using an optimized implementation of quicksort, using three-part partitions and randomized pivot selection, which should allow for fairly large data sets to be used with ease.  

### Documentation

This package provides some of the basic statisical operations for data contained in arrays. 

<code>mode(double[] array)</code> 

Finds the most frequently occuring entry in a given array. 

<code>mean(double[] array)</code> 

Finds the mean of a given array. 

<code>median(double[] array)</code>

Finds the median of a given array. 

<code>sortArray(double[] array)</code>

Sorts a given array in ascending order. 

<code>max(double[] array)</code>

Finds the largest value of a given array. 

<code>min(double[] array)</code>

Finds the smallest value of a given array. 

### Roadmap 

<i>Disclaimer: The beta version of FredStat only supports arrays of doubles. Future releases will contain the same methods, but with extended compatibility.</i>

* The API of this library is frozen.
* Version numbers adhere to semantic versioning.
