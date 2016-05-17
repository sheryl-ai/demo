#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

/**

  int pthread_create(...);

**/

void fun0(int x, int y) {
    printf("this is %d, that is %d\n", x, y);
}

void fun1() {
    printf("this is in fun1\n");
}

void fun2() {
    printf("this is in fun2\n");
}

int main() {
    pthread_t thread0, thread1, thread2;

    int ret_thread0 = pthread_create(&thread0, NULL, (void*)fun0, (void*)1);
    int ret_thread1 = pthread_create(&thread1, NULL, (void*)fun1, NULL);
    int ret_thread2 = pthread_create(&thread2, NULL, (void*)fun2, NULL);
    void *retval0, *retval1, *retval2;
    int t0 = pthread_join(thread0, &retval0);
    int t1 = pthread_join(thread1, &retval1);
    int t2 = pthread_join(thread2, &retval2);


    return 0;
}
