#User function Template for python3

class Solution:
    #Function to find the maximum number of meetings that can
    #be performed in a meeting room.
    def maximumMeetings(self,n,start,end):
        timings = []
        maximum_no_of_meetings = 1
        for i in range(len(start)):
            timings.append([start[i],end[i]])
        timings.sort(key = lambda x : (x[1]))
        limit = timings[0][1]
        for i in range(1, len(timings)):
            if limit < timings[i][0]:
                maximum_no_of_meetings += 1
                limit = timings[i][1]
        return maximum_no_of_meetings 
            
