The Non - Quadratfrei Coffee
The Non - Quadratfrei Coffee is a special type of coffee that only mathematicians drink. Legend says that this coffee has to be drunk only while generating certain special integers. These integers are special because in the prime factorization of these integers, prime number occurs more than once, i.e they are divisible by some perfect square.

It is said that if you are generating such integers up to some number
N
N (inclusive if
N
N is also a special integer), and if
X
X is the total number of special integers found, then the coffee has to be stirred
X
X times in the clockwise direction and further
X
X times in the anti-clockwise direction.

For a given
N
N, print the number of times your coffee has to be stirred before you drink it. Also, print all the special integers generated.

Input Format:

First line contains the number of testcases,
T
T.
Next
T
T lines follow, each containing a single number
N
N.

Output Format:

For each testcase, the first line of output contains the total number of stirs required before you drink the coffee.

And the second line contains the space separated special integers generated.

Constraints:

1
≤
T
≤
150
1≤T≤150
 1
≤
N
≤
1.5
×
10
5
1≤N≤1.5×105

Sample Input(Plaintext Link)
 1
10
Sample Output(Plaintext Link)
 6
4 8 9
Explanation
4
4,
8
8,
9
9 are the integers generated (up to
N
=
10
N=10) that has prime numbers more than once, in their prime factorization, i.e they are divisible by some perfect square.

4
=
2
×
2
,
8
=
2
×
2
×
2
,
9
=
3
×
3
4=2×2,8=2×2×2,9=3×3 are special.

Total number of stirs required is
6


============

No-Sort String
The first year Undergrads are going to be taught sorting today. Professor X begins his lecture in the usual way.

Sorting is any process of arranging items systematically, and has two similar but yet distinct meanings:

Ordering: arranging items in a sequence ordered by some criteria.
Categorizing: grouping items with similar properties.
After a few hours, the students easily got bored. They thought that the topic was trivial and no more interesting. Seeing this Professor X decided to make them realize its importance. He knew that the students are familiar about the basic of strings and character array, so he gave them a mind - boggling task.

Professor X gave the students K characters i.e a1 , a2 , a3 .. ak such that a1 < a2 < a3 .., < ak. He then asked them to form strings of a fixed length N out of these given K characters. The students quickly gave him the answer. Now when he realized that he has the attention of all the students, he asked them to tell the number of strings that have fixed length N and are not sorted. Since, the answer could be very large, he asked them to calculate it modulo 109 + 7.

Since the students are currently in first year, they found it difficult to answer and turn to you as you are one of their seniors. Help them in finding the required answer.

Input:

The first and the only line contains two space separated integers N and K that denote the length of string and the number of characters respectively.

Output:

Print the total number of unsorted strings of length N modulo 109 + 7 that could be formed from the given K set of characters.

Constraints:

1 ≤ N ≤ 1000
1 ≤ K ≤ 100
Sample Input(Plaintext Link)
 3 2
Sample Output(Plaintext Link)
 4
Explanation
The four unsorted strings formed of two given characters [a1, a2] are mentioned below for the above sample test case.

a1a2a1
a2a1a2
a2a2a1
a2a1a1