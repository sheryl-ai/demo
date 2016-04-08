all: manage.py
	python manage.py runserver 0.0.0.0:80

check: manage.py
	python manage.py check

shell: manage.py 
	python manage.py shell

migrate: manage.py
	python manage.py migrate books

makemigrations: manage.py
	python manage.py makemigrations books

sqlmigrate: manage.py
	python manage.py sqlmigrate books 0001_initial
