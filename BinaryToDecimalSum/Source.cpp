/*****-[Samantha J. Noggle]-*****
 **********-[Period 2]-**********
 *********--[02/04/18]--*********
 **-[This is my own work SJN]-**
 * -[Binary to Decimal converter & adds the sum of all 4 numbers.]-*/
#include <iostream>
using namespace std;
#include <time.h>
#include <math.h>

int main() {
	//variables
	float bin[4][4];
	float randNum = 0;
	float sum = 0;
	float dec = 0;

	srand(time(0));

	//randomy set em to 1 or 0
	cout << "\n\tBinary Grid:\n\t";
	for (int r = 0; r < 4; r++) {
		for (int c = 0; c < 4; c++) {
			randNum = (rand() % 2);
			bin[r][c] = randNum;
			cout << bin[r][c];
		}
		cout << "\n\t";
	}
	//add the rows together
	for (int r = 0; r < 4; r++) {
		float count = 3;
		for (int c = 0; c < 4; c++) {
			dec = pow(2, count);
			dec = dec * bin[r][c];
			count--;
			sum = sum + dec;
		}
	}
	cout << "\n\tThe sum is...\n\n" << sum;
}