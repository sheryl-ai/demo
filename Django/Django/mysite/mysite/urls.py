from django.conf.urls import *
from django.contrib import admin
admin.autodiscover()
from mysite.views import *

urlpatterns = [
    url(r'^admin/', include(admin.site.urls)),
    url(r'^display_meta/', display_meta),
    url(r'^$', homepage),
    url(r'^time/$', cur_time),
    url(r'^time/plus/(\d{1,5})/$', cur_time_ahead),
]
