# COMP285-PROGRAM1
COMP285 Programming Assignment 1: Cost Benefit Analysis

Like all businesses, CapMetro wants to make the most of their resources without sacrificing quality or cost. For the purpose of improving productivity, CapMetro has kept track of passenger data on their bus routes. This information is important because it helps them understand where to allocate resources and where they can improve savings. More buses should be dedicated to high volume routes whereas, fewer buses are needed for low volume routes. 

As a means to determine what routes are high or low volume, CapMetro utilizes the passenger density. Our task is to design an efficient algorithm that when given the rider data for a particular route will return the highest passenger density for that route. In order to accomplish this we must first divide the given array A into two seperate arrays B and C. This will allow us to divide the work and produce the O(nlogn) runtime we’re hoping for. Once divided we will continue to sort through each array looking for the greatest sum amongst both, testing for single elements that may be greater than the sum of the elements in that half or potential negative sums. Then we will combine the two arrays and find the greatest sum across both arrays. Then we will compare each of the three values and return the maximum as the highestPassengerDensity. 
