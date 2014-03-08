import uudised.Article
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_article_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/article/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: articleInstance, field: 'author', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("article.author.label"),'default':("Author")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("author"),'name':("author.id"),'from':(uudised.User.list()),'optionKey':("id"),'required':(""),'value':(articleInstance?.author?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'content', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("article.content.label"),'default':("Content")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("content"),'value':(articleInstance?.content)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'date', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("article.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("date"),'precision':("day"),'value':(articleInstance?.date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'descriptionLong', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("article.descriptionLong.label"),'default':("Description Long")],-1)
printHtmlPart(5)
invokeTag('textField','g',37,['name':("descriptionLong"),'value':(articleInstance?.descriptionLong)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'descriptionShort', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("article.descriptionShort.label"),'default':("Description Short")],-1)
printHtmlPart(5)
invokeTag('textField','g',46,['name':("descriptionShort"),'value':(articleInstance?.descriptionShort)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'introduction', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("article.introduction.label"),'default':("Introduction")],-1)
printHtmlPart(5)
invokeTag('textField','g',55,['name':("introduction"),'value':(articleInstance?.introduction)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'priority', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("article.priority.label"),'default':("Priority")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("priority"),'type':("number"),'value':(articleInstance.priority),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'title', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("article.title.label"),'default':("Title")],-1)
printHtmlPart(5)
invokeTag('textField','g',73,['name':("title"),'value':(articleInstance?.title)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: articleInstance, field: 'views', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("article.views.label"),'default':("Views")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("views"),'type':("number"),'value':(articleInstance.views),'required':("")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1393247412701L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
