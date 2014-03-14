import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_user_welcomeMessage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_welcomeMessage.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
if(true && (session?.user)) {
printHtmlPart(2)
expressionOut.print(session?.user?.firstName)
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',4,['controller':("user"),'action':("logout")],2)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',7,['controller':("user"),'action':("favorites")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',8,['controller':("news"),'action':("main")],2)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(session?.user?.firstName)
printHtmlPart(11)
expressionOut.print(session.user.articlesPublished?.size() ?: 0)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394363766593L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
