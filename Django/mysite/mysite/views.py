from django.http import HttpResponse
from django.shortcuts import render_to_response
import datetime

def display_meta(request):
    values = request.META.items()
    values.sort()
    html = []
    
    for k, v in values:
        html.append('<tr><td>%s</td><td>%s</td></tr>' % (k, v))

    return HttpResponse('<table>%s</table>' % '\n'.join(html))

def homepage(request):
    return render_to_response('base.html')

def cur_time(request):
    current_date = datetime.datetime.now()
    return render_to_response('current_datetime.html', locals()) 

def cur_time_ahead(request, offset):
    try:
        offset = int(offset)
    except:
        raise Http404()
    dt = datetime.datetime.now() + datetime.timedelta(hours=offset)
    return render_to_response('hours_ahead.html', {'hour_offset':offset, 'next_time':dt})
