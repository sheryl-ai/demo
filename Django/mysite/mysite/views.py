from django.template.loader import get_template
from django.template import Context
from django.http import HttpResponse
import datetime

def homepage_view(request):
    return HttpResponse("My Home Page!")

def hello(request):
    return HttpResponse("Hello, world!!")

def cur_time(request):
    now = datetime.datetime.now()
    t = get_template('abc.html')
    html = t.render(Context({'current_date': now}))
    return HttpResponse(html)

def cur_time_ahead(request, offset):
    try:
        offset = int(offset)
    except:
        raise Http404()
    dt = datetime.datetime.now() + datetime.timedelta(hours=offset)
    html = "<html><body>In %s hour(s), it will be %s.</body><html>" % (offset, dt)
    return HttpResponse(html)
