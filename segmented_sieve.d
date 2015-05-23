/*
Copyright 2015 ALY SHMAHELL

 This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
