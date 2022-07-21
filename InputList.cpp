//Assignment 3 part 1
// @author: Abhijay Dutta
//Section 1
#include <iostream>
#include <vector> //include vector library to use vectors
using namespace std;
int main() {
  vector<int> userInts; // A vector to hold the user's input integers
  unsigned int i;
  int tempVal; //temporary value
  int NUM_Inputs;
  int secVal;
  
  cout << "Enter first number: " << endl;
  cin >> NUM_Inputs;
  secVal = NUM_Inputs -1;
  userInts.resize(NUM_Inputs);
  cout << "Enter " << secVal << " integer values: ";
  for(i=0; i < secVal; ++i){
    cin >> userInts.at(i);
  }
  for(i=0; i < (userInts.size()/ 2); ++i){
    tempVal = userInts.at(i);
    userInts.at(i) = userInts.at(userInts.size() - 1 - i);
    userInts.at(userInts.size() - 1 - i) =tempVal;
  }
  for(i=1; i< userInts.size(); ++i){
    cout << userInts.at(i) << ", ";
  }
  cout << NUM_Inputs;
return 0;
}
