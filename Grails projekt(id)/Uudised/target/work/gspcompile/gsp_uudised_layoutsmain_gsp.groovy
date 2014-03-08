import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_uudised_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(7)
invokeTag('layoutHead','g',17,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',18,['library':("application")],-1)
printHtmlPart(8)
invokeTag('layoutResources','r',19,[:],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(12)
if(true && (session.user)) {
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',30,['controller':("user"),'action':("favorites")],3)
printHtmlPart(15)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',34,['controller':("user"),'action':("register")],3)
printHtmlPart(18)
}
printHtmlPart(19)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(20)
expressionOut.print(createLink(uri: '/eesti'))
printHtmlPart(21)
expressionOut.print(createLink(uri: '/valismaa'))
printHtmlPart(22)
expressionOut.print(createLink(uri: '/poliitika'))
printHtmlPart(23)
expressionOut.print(createLink(uri: '/sport'))
printHtmlPart(24)
expressionOut.print(createLink(uri: '/kultuur'))
printHtmlPart(25)
expressionOut.print(createLinkTo(dir:'images',file:'spinner.gif'))
printHtmlPart(26)
if(true && (session?.user)) {
printHtmlPart(27)
invokeTag('render','g',65,['template':("/user/welcomeMessage")],-1)
printHtmlPart(28)
}
printHtmlPart(28)
invokeTag('javascript','g',67,['library':("application")],-1)
printHtmlPart(29)
invokeTag('layoutBody','g',69,[:],-1)
printHtmlPart(30)
invokeTag('layoutResources','r',78,[:],-1)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',79,['class':("application")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394183766346L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
