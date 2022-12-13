package com.xworkz.crud.runner;

public class kkk {
	public static List<int> findValidDiscountCoupons(List<string> discounts)
    {
        var r = new List<int>(); // result
        foreach (var s in discounts)
        {
            if (s == "")
                r.Add(1);x`
            else if (s.Length == 1)
                r.Add(0);
            else
            {
                if (isAllCharCountEven(s) && areCharPairsValid(s))
                    r.Add(1);
                else
                    r.Add(0);
            }
        }

        return r;
    }

	public static bool areCharPairsValid(string s)
    {
        char[] a = s.ToCharArray();

        int y = a.Length;

        for (int x = 0; x < y; x++)
        {
            if (x + 1 < y && a[x] == a[x + 1])
            {
                // two valid characteres together
                x++;
}
