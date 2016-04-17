from django.contrib import admin

from .models import *

class ChoiceInline(admin.StackedInline):
    model = Choice
    extra = 0

class ChoiceTabularInline(admin.TabularInline):
    model = Choice
    extra = 0

class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
            ('Question text',    {'fields': ['question_text']}),
            ('Date information', {'fields': ['pub_date']}),
    ]

    search_fields = ['question_text']
    list_display = ('question_text', 'pub_date', 'was_published_recently')
    list_filter = ['pub_date']
    #inlines = [ChoiceInline]
    inlines = [ChoiceTabularInline]

admin.site.register(Question, QuestionAdmin)

admin.site.register(Choice)
