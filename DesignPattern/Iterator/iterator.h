#ifndef __ITERATOR_H__
#define __ITERATOR_H__

template<class item>
class list;

template<class item>
class Iterator {
    private:
        const list<item>* _list;
        long _current;
    public:
        Iterator(const Iterator &itor);
        Iterator(const list<item>* _list);
        void first();
        void pre();
        void next();
        bool isDone();
        const item & currentItem() const;
        Iterator<item> operator=(const Iterator&itor);
};

#include "iterator.cc"

#endif
