l="""0 can be fitted in
* byte
* short
* int
* long
1 can be fitted in
* byte
* short
* int
* long
-1 can be fitted in
* byte
* short
* int
* long
18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
32768 can be fitted in
* int
* long
-32768 can be fitted in
* short
* int
* long
32767 can be fitted in
* short
* int
* long
-32767 can be fitted in
* short
* int
* long
2147483648 can be fitted in
* long
2147483647 can be fitted in
* int
* long
-2147483648 can be fitted in
* int
* long
-2147483647 can be fitted in
* int
* long
128 can be fitted in
* short
* int
* long
127 can be fitted in
* byte
* short
* int
* long
-128 can be fitted in
* byte
* short
* int
* long
-127 can be fitted in
* byte
* short
* int
* long
123123123333333333333333333333333313123123 can't be fitted anywhere.
234444444444444444444444444444444444444 can't be fitted anywhere.
-1222222 can be fitted in
* int
* long"""


l1="""0 can be fitted in
* byte
* short
* int
* long
1 can be fitted in
* byte
* short
* int
* long
-1 can be fitted in
* byte
* short
* int
* long
18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
32768 can be fitted in
* short
* int
* long
-32768 can be fitted in
* short
* int
* long
32767 can be fitted in
* short
* int
* long
-32767 can be fitted in
* short
* int
* long
2147483648 can be fitted in
* int
* long
2147483647 can be fitted in
* int
* long
-2147483648 can be fitted in
* int
* long
-2147483647 can be fitted in
* int
* long
128 can be fitted in
* short
* int
* long
127 can be fitted in
* byte
* short
* int
* long
-128 can be fitted in
* byte
* short
* int
* long
-127 can be fitted in
* byte
* short
* int
* long
123123123333333333333333333333333313123123 can't be fitted anywhere.
234444444444444444444444444444444444444 can't be fitted anywhere.
-1222222 can be fitted in
* int
* long"""


print(l==l1)
