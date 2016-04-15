from django.http import HttpResponse, Http404
from django.shortcuts import render_to_response

def homepage(request):
    return HttpResponse("Welcome to mysite. -spxcds");

def NotFound(request):
    raise Http404("Question does not exist");
