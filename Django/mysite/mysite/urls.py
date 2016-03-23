from django.conf.urls import *
from mysite.views import *

urlpatterns = patterns('',
        (r'^$', home_page),
        (r'^cur_time/$', cur_time),
        (r'^cur_time/plus/(\d{1,5})/$', cur_time_ahead),
        (r'^hello/$', hello)
)
