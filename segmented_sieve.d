/*
Copyright (c) 2015-2016 Aly Shmahell

 This software is provided 'as-is', without any express or implied warranty. 
 In no event will the authors be held liable for any damages arising from
 the use of this software.

    Permission is granted to anyone to use this software for any purpose,
    including commercial applications, and to alter it and redistribute it
    freely, subject to the following restrictions:

    1. The origin of this software must not be misrepresented; you must not
       claim that you wrote the original software. If you use this software
       in a product, an acknowledgement in the product documentation is required.
    2. Altered source versions must be plainly marked as such, and must not be
       misrepresented as being the original software.
    3. This notice may not be removed or altered from any source distribution.
*/

import std.stdio, std.bigint, std.string, std.conv, std.stream,std.datetime;

/* this simple program finds all primes between one given number b
passed to the program from the terminal as an argument, and
the value a=(b-999)  */

void main(string g[])
{
      //Input & Define Range
      BigInt b=g[1];
      BigInt a=(b-999);

        if(a==1) a++;

        //Define Sieve
        BigInt p[1000];

        //Initialize Sieve
        for(ulong i=0;i<=999;i++)
         p[i]=1;

        //Start Sieving
        for(BigInt i=2;i*i<=b;i++)
        {
            BigInt k=a/i;
            k*=i;
            for(BigInt j=k;j<=b;j+=i)
              if(j!=i&&j>=a)
                {
                 BigInt m=j-a;
                 ulong n=0;
                 for(BigInt o=0;o<m;o++)
                  n++;
                  p[n]=0;
                }     
        }

        //Output
        for(ulong i=0;i<=999;i++)
        if(p[i]==1)
         writeln(a+i);
}
