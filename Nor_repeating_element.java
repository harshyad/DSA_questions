class Nor_repeating_element
{
    // Return the maximum Sum of difference
    // between consecutive elements.
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];
     
        return res;
    }

    // Driver code
    public static void main (String[] args)
    {
        int ar[] = {5, 3, 5, 4, 9, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                            findSingle(ar, n) + " ");
    }
}

