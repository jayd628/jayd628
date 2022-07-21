//Author: Abhijay Dutta
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

void takeStep(int& xcoord, int& ycoord){
  
  //We define direction variable to store value
  int step = rand() % 4;

  if(step==0){
    xcoord-=1;
  }
  else if(step==1){
    xcoord+=1;
  }
  else if(step==2){
    ycoord-=1;
  }
  else{
    ycoord+=1;
  }
}

int main(int argc, char *args[]) {
	//int N = atoi(args[1]); // read in number of steps N
  int N = 200;
  int T = 100000;
	int x = 0;  // starting x position
	int y = 0;  // starting y position
	double r;	// squared distance
  srand(time(0)); //Seeding random function using time
  //int T = atoi(args[2]);
  for(int i = 0; i < T; i++){
    for(int j = 0; j < N; j++){
      takeStep(x,y);
    }
  }
  r = (x*x) + (y*y);
  cout << "Mean squared distance = " << (r/T);
// loop through number of steps
	
return 0;
}
