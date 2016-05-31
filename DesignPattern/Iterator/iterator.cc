#include "iterator.h"

template<class item>
Iterator<item>::Iterator(const Iterator& itor) {
    this->_list = itor._list;
    this->_current = 0;
}


template<class item>
Iterator<item>::Iterator(const list<item>* _list) {
    this->_list = _list;
    this->_current = 0;
}

template<class item>
void Iterator<item>::first() {
    this->_current = 0;
}


template<class item>
void Iterator<item>::pre() {
    --(this->_current);
}

template<class item>
void Iterator<item>::next() {
    ++(this->_current);
}

template<class item>
bool Iterator<item>::isDone() {
    return this->_current >= (this->_list)->size();
}

template<class item>
const item & Iterator<item>::currentItem() const{
    return (this->_list)->get(this->_current);
}

template<class item>
Iterator<item> Iterator<item>::operator=(const Iterator& itor) {
    return Iterator(itor);
}
