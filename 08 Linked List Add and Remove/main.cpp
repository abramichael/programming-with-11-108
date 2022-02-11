#include <iostream>

using namespace std;

struct elem {
    int value;
    elem * next;
};

int main()
{
    elem * head = NULL;
    elem * p = new elem;
    p -> value = 5;
    p -> next = head;
    head = p;
    cout << head -> value << endl;
    delete head;
    return 0;
}
