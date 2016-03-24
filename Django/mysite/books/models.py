from django.db import models

class User (models.Model):
    name = models.CharField(max_length=20)
    pwd = models.CharField(max_length=20)

    def __str__(self):
        return self.name

    class Meta:
        ordering = ['name']

class Publisher(models.Model):
    name = models.CharField(max_length=30)
    address = models.CharField(max_length=50)
    city = models.CharField(max_length=60)
    state_province = models.CharField(max_length=30)
    country = models.CharField(max_length=50)
    website = models.URLField()

    def __str__(self):
        return self.name

    class Meta:
        ordering = ['name']

class Author(models.Model):
    salutation = models.CharField(max_length=10)
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=40)
    email = models.EmailField()
    #headshot = models.ImageField(upload_to='/tmp')

    def __str__(self):
        return '%s %s' % (self.first_name, self.last_name)

    class Meta:
        ordering = ['first_name']

class Book(models.Model):
    title = models.CharField(max_length=100)
    authors = models.ManyToManyField(Author)
    publisher = models.ForeignKey(Publisher)
    publication_date = models.DateField()
    #num_pages = models.IntegerField(blank=True, null=True)

    def __str__(self):
        return self.title
    
    class Meta:
        ordering = ['title']

