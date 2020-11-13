# HackerRank-HashMap-Ransom-Note-Solution
A Java solution to HackerRank's Ransom note problem

A great example of when to use a HashMap.

A HashMap is created to track the frequency of the words in the note as a value. 

Using the index of the message String array as a key for this value we can then compare the value total from the
note, which has now been put into a hashmap with a corrispodning frequency, to the magazine. 

We compare the string value of the index of the magazine string array with a for each loop  to the keys of the HashMap

Each time the string from the HashMap envounters an identical string from the Magazine the HashMap we will remove that key value pair.  

We add a condition to make sure if we encounter a value with the frequency higher than one we reduce that value by 1.

The HashMap is checked to see if it is empty if so we can create a note if not we cannot "Yes": "No"
