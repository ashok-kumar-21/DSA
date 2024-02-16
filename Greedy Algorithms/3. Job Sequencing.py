class Solution:
    
    #Function to find the maximum profit and the number of jobs done.
    def JobScheduling(self,jobs,n):
        # code here
        jobs.sort(key = lambda x: x.profit, reverse = True)
        maximum_deadline = 0
        for i in jobs:
            maximum_deadline = max(i.deadline, maximum_deadline)
        l = [-1] * maximum_deadline
        no_of_jobs = 0
        total_profit = 0
        for i in range(len(jobs)):
            for j in range(jobs[i].deadline-1, -1,-1):
                if l[j] == -1:
                    l[j] = jobs[i].id
                    no_of_jobs += 1
                    total_profit += jobs[i].profit
                    break
        return [no_of_jobs, total_profit]
