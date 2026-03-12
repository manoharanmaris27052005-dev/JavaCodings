package projecttt;

public class Patterns {

    public static void main(String[] args) {

        // 1
        System.out.println("Pattern 1");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 2
        System.out.println("Pattern 2");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 3
        System.out.println("Pattern 3");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 4
        System.out.println("Pattern 4");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 5
        System.out.println("Pattern 5");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 6
        System.out.println("Pattern 6");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 7
        System.out.println("Pattern 7");
        for(char i='A';i<='E';i++)
        {
            for(char j='A';j<='E';j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 8
        System.out.println("Pattern 8");
        for(char i='A';i<='E';i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 9
        System.out.println("Pattern 9");
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 10
        System.out.println("Pattern 10");
        for(char i='e';i>='a';i--)
        {
            for(char j='a';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 11 Right Triangle
        System.out.println("Pattern 11");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 12 Number Pyramid
        System.out.println("Pattern 12");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 13 Inverted Pyramid
        System.out.println("Pattern 13");
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 14 Odd Numbers
        System.out.println("Pattern 14");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((j*2-1)+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 15 Even Numbers
        System.out.println("Pattern 15");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((j*2)+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 16 Hollow Square
        int n=5;
        System.out.println("Pattern 16");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        // 17 Hollow Triangle
        int k = 5;
        System.out.println("Pattern 17");
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1||i==k||j==1||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    
    


System.out.println();

// 18
System.out.println("Pattern 18");
for(int i=1;i<=5;i++)
{
    for(int j=5;j>=i;j--)
    {
        System.out.print("* ");
    }
    System.out.println();
}

System.out.println();

// 19
System.out.println("Pattern 19");
for(int i=1;i<=5;i++)
{
    for(int j=5;j>=i;j--)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}

System.out.println();

// 20
System.out.println("Pattern 20");
for(int i=5;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}

System.out.println();

// 21
System.out.println("Pattern 21");
for(char i='A';i<='E';i++)
{
    for(char j='E';j>=i;j--)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}

System.out.println();

// 22
System.out.println("Pattern 22");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(i*j+" ");
    }
    System.out.println();
}

System.out.println();

// 23
System.out.println("Pattern 23");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(i+j+" ");
    }
    System.out.println();
}

System.out.println();

// 24
System.out.println("Pattern 24");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        if((i+j)%2==0)
            System.out.print("1 ");
        else
            System.out.print("0 ");
    }
    System.out.println();
}

System.out.println();

// 25
System.out.println("Pattern 25");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print((char)(64+j)+" ");
    }
    System.out.println();
}

System.out.println();

// 26
System.out.println("Pattern 26");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print((char)(64+i)+" ");
    }
    System.out.println();
}

System.out.println();

// 27
System.out.println("Pattern 27");
int num=1;
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(num+" ");
        num++;
    }
    System.out.println();
}

System.out.println();

// 28
System.out.println("Pattern 28");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(i%2+" ");
    }
    System.out.println();
}

System.out.println();

// 29
System.out.println("Pattern 29");
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print((i+j)+" ");
    }
    System.out.println();
}

System.out.println();

// 30
System.out.println("Pattern 30");
for(int i=1;i<=5;i++)
{
    for(int j=5;j>=i;j--)
    {
        System.out.print(" ");
    }
    for(int x=1;x<=i;x++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}


 // 31
    System.out.println("Pattern 31");
    for(int i=5;i>=1;i--)
    {
        for(int j=i;j<=5;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    System.out.println();

    // 32
    System.out.println("Pattern 32");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==j)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 33
    System.out.println("Pattern 33");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i+j==6)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 34
    System.out.println("Pattern 34");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==j || i+j==6)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 35
    System.out.println("Pattern 35");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1 || i==5 || j==3)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 36
    System.out.println("Pattern 36");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j==1 || j==5 || i==3)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 37
    System.out.println("Pattern 37");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1 || j==1 || i==5)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 38
    System.out.println("Pattern 38");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j==1 || j==5 || i==1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 39
    System.out.println("Pattern 39");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==j || j==1 || i==5)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 40
    System.out.println("Pattern 40");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1 || i==5 || j==1 || j==5 || i==3)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 41
    System.out.println("Pattern 41");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j==1 || j==5 || i==1 || i==3)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 42
    System.out.println("Pattern 42");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1 || i==3 || i==5 || j==1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 43
    System.out.println("Pattern 43");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j==1 || i==1 || i==3 || i==5)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 44
    System.out.println("Pattern 44");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(j==1 || j==5 || i==3)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

    System.out.println();

    // 45
    System.out.println("Pattern 45");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1 || i==5 || j==1 || j==5 || i==j)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
    }
}
