#include <iostream>
#include <string>

#include "list.h"
#include "iterator.h"

using namespace std;

int main() {
    list<int> ProductList;
    Iterator<int>* DIterator = ProductList.createIterator();

    for (int i = 0; i < 10; ++i)
        ProductList.insert(i);

    ProductList.erase(3);

    cout << ProductList.get(4) << endl;

    ProductList.set(4, -1);

    cout << ProductList.get(4) << endl;

    cout << ProductList.size() << endl;

    while (!DIterator->isDone()) {
        cout << DIterator->currentItem() << endl;
        DIterator->next();
    }

    DIterator->first();

    while (!DIterator->isDone()) {
        cout << DIterator->currentItem() << endl;
        DIterator->next();
    }

    delete DIterator;

    return 0;
}
