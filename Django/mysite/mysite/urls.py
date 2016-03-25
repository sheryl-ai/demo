from django.conf.urls import *
from django.contrib import admin
from mysite.views import *

urlpatterns = [
    url(r'^admin/', include(admin.site.urls)),
    url(r'^$', homepage),
    url(r'^time/$', cur_time),
    url(r'^time/plus/(\d{1,5})/$', cur_time_ahead),
]
