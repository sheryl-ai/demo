#include "list.h"

template<class item>
list<item>::list() {
    this->len = 0;
    this->capacity = 8;
    this->aryList = new item[capacity];
}


template<class item>
list<item>::~list() {
    delete [] this->aryList;
}

template<class item>
Iterator<item>* list<item>::createIterator() {
    return new Iterator<item>(this);
}

template<class item>
void list<item>::insert(item items) {
    if (this->len >= this->capacity) {
        this->capacity <<= 1;
        item* _aryList = new item[this->capacity];
        for (int i = 0; i < this->len; ++i) {
            _aryList[i] = this->aryList[i];
        }
        item* tmp = this->aryList;
        this->aryList = _aryList;
        delete [] tmp;
    }
    this->aryList[len++] = items;
}

template<class item>
void list<item>::erase(unsigned index) {
    for (int i = index; i < this->len - 1; ++i) {
        this->aryList[i] = this->aryList[i + 1];
    }
    --this->len;
}

template<class item>
const unsigned list<item>::size() const{
    return this->len;
}

template<class item>
const item& list<item>::get(unsigned index) const{
    return this->aryList[index];
}

template<class item>
void list<item>::set(unsigned index, item value) {
    this->aryList[index] = value;
}
