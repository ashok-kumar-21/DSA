class Solution
{
    class ItemComparator implements Comparator<Item>{
        
        public  int compare(Item a, Item b){
            double r1 = (double)(a.value) / (double)(a.weight); 
            double r2 = (double)(b.value) / (double)(b.weight); 
            if(r1 < r2) return 1; 
            else if(r1 > r2) return -1; 
            else return 0;
        }
    }
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new ItemComparator());
        double result = 0.0;
        double price = 0.0;
        for(Item i: arr){
            if(i.weight > W){
                price = ((double)i.value / (double)i.weight);
                result += ((double)price * (double)W);
                break;
            } else{
                result += (i.value);
                W -= i.weight;
            }
        }
        return result;
        // Your code here
    }
}
