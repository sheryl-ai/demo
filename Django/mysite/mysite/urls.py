from django.conf.urls import *
from mysite.views import *

urlpatterns = patterns('',
        (r'^$', homepage),
        (r'^time/$', cur_time),
        (r'^time/plus/(\d{1,5})/$', cur_time_ahead)
)
