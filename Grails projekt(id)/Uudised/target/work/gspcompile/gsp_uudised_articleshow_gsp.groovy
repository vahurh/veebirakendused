import uudised.Article
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_articleshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/article/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'article.label', default: 'Article'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (articleInstance?.author)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("article.author.label"),'default':("Author")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(articleInstance?.author?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("user"),'action':("show"),'id':(articleInstance?.author?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.content)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("article.content.label"),'default':("Content")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(articleInstance),'field':("content")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.date)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("article.date.label"),'default':("Date")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(articleInstance?.date)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.descriptionLong)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("article.descriptionLong.label"),'default':("Description Long")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(articleInstance),'field':("descriptionLong")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.descriptionShort)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("article.descriptionShort.label"),'default':("Description Short")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(articleInstance),'field':("descriptionShort")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.introduction)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("article.introduction.label"),'default':("Introduction")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(articleInstance),'field':("introduction")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.priority)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("article.priority.label"),'default':("Priority")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(articleInstance),'field':("priority")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.title)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("article.title.label"),'default':("Title")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(articleInstance),'field':("title")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (articleInstance?.views)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("article.views.label"),'default':("Views")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(articleInstance),'field':("views")],-1)
printHtmlPart(16)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
invokeTag('message','g',110,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',110,['class':("edit"),'action':("edit"),'resource':(articleInstance)],3)
printHtmlPart(36)
invokeTag('actionSubmit','g',111,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
})
invokeTag('form','g',113,['url':([resource:articleInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1393247412310L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
