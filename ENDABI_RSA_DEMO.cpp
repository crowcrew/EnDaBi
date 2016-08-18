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

#include <iostream>
#include <string.h>
#include <sstream>
#include <stdio.h>
#include <stdint.h>
#include "ENDABI_RSA_CORE.hpp"
#include "3rd_party/InfInt.h"

using namespace std;
int main()
{
    InfInt desired_pk,desired_p,desired_q;
    cout<<"please input the desired public-key sequence \n(desired public-key, desired p, desired q) and wait for us to make the right \ncorrections and generate a suitable public-key\n>> ";
    cin>>desired_pk>>desired_p>>desired_q;
    pub_key_sequence<InfInt> pks = generate_public_key(desired_pk,desired_p,desired_q);
    stringstream pks_string;
    pks_string<<"public-key sequence : pk: "<<pks.pk<<"  n:  "<<pks.n;
    cout<<pks_string.str()<<endl;
    cout<<"do you want a private key? Y or N\n";
    string answer;
    cin>>answer;
    if(answer=="Y"||answer=="y")
    {
        InfInt prvk = calculate_private_key(pks.pk,pks.p_,pks.q_);
        stringstream prvks_string;
        prvks_string<<"private-key : "<<prvk<<" n: "<<pks.n;
        cout<<prvks_string.str()<<endl;
        printf("Do you want to encrypt a numerical message? \nType either Y or N.\n>> ");
        cin>>answer;
        if(answer=="Y"||answer=="y")
        {
        printf("Good, now we can continue,\nIf typed Y please input the desired message (max char count is 200) :\n>> ");
            char message [200];
            InfInt plain_numerical[200];
            InfInt encrypted_numerical[200];
            InfInt decrypted_numerical[200];
            cin.ignore();
            gets(message);
            int mssg_length = strlen(message);
            for(int i =0; i<mssg_length; i++)
            {
                plain_numerical[i]=message[i]-'0';
                encrypted_numerical[i]=encrypt((InfInt)plain_numerical[i],pks.pk,pks.n);
                cout<<encrypted_numerical[i];
            }
            printf("\n");
            cout<<"Now, do you want to decrypt the message?\n>> ";
                cin>>answer;
            if(answer=="Y"||answer=="y")
            {
                for(int i =0; i<mssg_length; i++)
                {
                    decrypted_numerical[i]=decrypt(encrypted_numerical[i],prvk,pks.n);
                    cout<<decrypted_numerical[i];
                }
                printf("\n");
            }
            else
            {
                printf("Well, there's nothing more we can do for you then.\nHappy insecurty :)\n");
                return 0;
            }
        }
        else
        {
            printf("Well, there's nothing more we can do for you then.\nHappy insecurty :)\n");
            return 0;
        }
    }
    else
    {
        printf("Well, there's nothing more we can do for you then.\nHappy insecurty :)\n");
        return 0;
    }

}

