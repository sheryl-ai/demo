#ifndef __LIST_H__ 
#define __LIST_H__

template<class item>
class Iterator;

template<class item>
class list {
    private:
        unsigned len;
        unsigned capacity;
        item *aryList;
    public:
        list();
        ~list();
        Iterator<item>* createIterator();
        void insert(item);
        void erase(unsigned index);
        const unsigned size() const;
        const item& get(unsigned index) const;
        void set(unsigned index, item value);
};

#include "list.cc"

#endif
