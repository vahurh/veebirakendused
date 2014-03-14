import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_news_bigPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/news/_bigPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(createLink(controller:'article', action:'displayImage', id: articles[0].id ))
printHtmlPart(2)
})
invokeTag('link','g',4,['controller':("article"),'action':("show"),'params':([id:articles[0].id])],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(articles[0].title)
printHtmlPart(5)
})
invokeTag('link','g',5,['controller':("article"),'action':("show"),'params':([id:articles[0].id])],1)
printHtmlPart(6)
expressionOut.print(articles[0].intro)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(controller:'article', action:'displayImage', id: articles[1].id ))
printHtmlPart(2)
})
invokeTag('link','g',10,['controller':("article"),'action':("show"),'params':([id:articles[1].id])],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(articles[1].title)
printHtmlPart(5)
})
invokeTag('link','g',11,['controller':("article"),'action':("show"),'params':([id:articles[1].id])],1)
printHtmlPart(10)
expressionOut.print(articles[1].intro)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(articles[2].title)
printHtmlPart(5)
})
invokeTag('link','g',16,['controller':("article"),'action':("show"),'params':([id:articles[2].id])],1)
printHtmlPart(12)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(articles[3].title)
printHtmlPart(5)
})
invokeTag('link','g',17,['controller':("article"),'action':("show"),'params':([id:articles[3].id])],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394630849690L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
