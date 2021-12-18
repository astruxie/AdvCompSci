#include <iostream>
#include <bits/stdc++.h>
using namespace std;

//function things pototypes
int randomizeCases();
int chooseYourCase();
int chooseFiveCases();
int bankerCall();
int endGame();

int main() {
	//arrays
	int caseArray[25] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 ,24, 25, 26};
	float amountArray[25] = {.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0 100.0, 200.0, 300.0, 400.0, 500.0, 750.0, 1000.0, 5000.0, 10000.0, 25000.0, 50000.0, 75000.0, 100000.0, 250000.0, 400000.0, 500000.0, 750000.0, 1000000.0, 3000000.0};
	cout << "Welcome to Deal Or No Deal!";
	randomizeCases();
	chooseYourCase();
}
int randomizeCases(int ammountArray[25]) {
	// Use of shuffle 
    shuffle(s.begin(), s.end(), default_random_engine(seed)); 
  
    cout << "shuffled elements are:"; 
    for (int& i : s) 
        cout << ' ' << i; 
    cout << endl; 
  
    return 0; 
}
int chooseYourCase() {
	cout << "First, choose your personal case!";
	return 1;
}

//OwO whats this