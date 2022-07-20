/Assignment 1
// @author: Abhijay Dutta
//Section 1
#include <iostream>
using namespace std;
int main() 
{
  double firstNum;
  double secondNum;
  double thirdNum;
  double fourthNum;
  double fifthNum;

  cout << "We will average a few numbers.\n";

  cout << "What is your first number? ";
  cin >> firstNum;
  cout << endl<< "What is your second number? ";
  cin >> secondNum;
  cout << endl << "What is your third number? ";
  cin >> thirdNum;
  cout << endl << "What is your fourth number? ";
  cin >> fourthNum;
  cout << endl << "What is your fifth number? ";
  cin >> fifthNum;

  double averageNum = ((firstNum + secondNum + thirdNum + fourthNum +fifthNum) / 5);
  cout << "The average is " << averageNum;

  return 0;
}
