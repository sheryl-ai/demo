-- start a project

    django-admin.py startproject mysite

-- run as a server
    python manage.py runserver 0.0.0.0:80
    
--  RemovedInDjango110Warning: django.conf.urls.patterns() is deprecated and will be removed in Django 1.10. Update your urlpatterns to be a list of django.conf.urls.url() instances
    
    To solve this question

    CHANGE

    urlpatterns = patterns(
        (r'^$', home_pate),
        (r'^time/$', cur_time),
    )

    INTO

    urlpatterns = [
        url(r'^$', home_pate),
        url(r'^time/$', cur_time),
    ]

-- When I need to start a database
    
    python manage.py startapp books


-- When write a TABLE in models, I should wrote like this
    
    from django.db import models

    // I wrote a table use a class

    class User(models.Model):
        name = models.CharField(maxlength=30)
        pwd = models.CharField(maxlength=30)

        def __str__(self):
            return self.name
        // return a string instead of a object

        class Meta:
            ordering = ['name']
        //the ordering default

        // if the Django is a new version, we 
        // should chang the maxlength into max_length

    Then we should make the models sense
        for example:

        INSTALLED_APPS = (
            #
            #
            #
            #
            'mysite.books',
        )
    
    To begin with, we checked the models if valid

        python manage.py validate
        //if the Django is a new version, Use
        //python manage.py checkout

    If we want to know how the model convert into the SQL

        python manage.py sqlall books
        //if the Django is a new version, Use
        //python manage.py sqlmigrage books 0001_initial

    If we want to migrate the database
        python manage.py syncdb
        //if the Django is a new version, Use
        //python manage.py migrate books

    we use the next instruction to check if the database changed and
    generate the database migrations files

        python manage.py makemigrations books

-- Basic visit of the database

    python manage.py shell
    
    from books.models import User
    user = User(name='spcxds', pwd='spxcds')
    user.save() // if not, this data can not sava into the database
    P = User.objects.all()
    print p.id // print the id of this object

    user = User.objects.filter(name='spxcds')
    // user a filter

    user = User.objects.get(name='spxcds')
    // get a objects

    we also could use the instructions like this
    User.objects.all()[0]

    user = User.objects.get(name='spxcds')
    user.delete() 
    //delete an object



create the superUser

from django.contrib.auth.models import User

user = User.objects.create_superuser('name', 'emailname@demon.com', 'pwd')
