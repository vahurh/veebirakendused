import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_news_highlights_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/news/_highlights.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(createLink(controller:'article', action:'displayImage', id: article.id ))
printHtmlPart(2)
})
invokeTag('link','g',3,['controller':("article"),'action':("show"),'params':([id:article.id])],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(article.title)
printHtmlPart(5)
})
invokeTag('link','g',4,['controller':("article"),'action':("show"),'params':([id:article.id])],1)
printHtmlPart(6)
expressionOut.print(article.intro)
printHtmlPart(7)
invokeTag('formatDate','g',8,['format':("yyyy-MM-dd HH:mm"),'date':(article.dateCreated)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394617120630L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
