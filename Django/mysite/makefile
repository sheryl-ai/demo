all: manage.py
	python manage.py runserver 0.0.0.0:80
check: manage.py
	python manage.py check
migrate: check
	python manage.py makemigrations
	python manage.py migrate
shell: manage.py
	python manage.py shell
admin: 
	python manage.py createsuperuser
changepassword:
	python manage.py changepassword admin
